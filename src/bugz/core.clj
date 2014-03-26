(ns bugz.core
  (:gen-class)
  (:use seesaw.core))

(defn build-frame []
  (-> (frame :title "howdy"
             :width 400
             :height 400)))

(defn show-frame [f]
  (show! f))


;; { :sugar-spots [{ :location [x y] :qty 100 }]
;;   :grid [
;;       [{ :sugar 0 :scents [] :ants [] :holes [] }]
;;     ]
;;   :colonies [
;;       { :ants [{:sugar 1 }]
;;         :sugar 0
;;         :holes [] }
;;       { :ants []
;;         :sugar 0
;;         :holes [] }
;;     ]
;; }

(defn -main [& args]
  (invoke-later
    (-> (frame :title "Hello",
            :content "Hellow, Seesaw",
            :on-close :exit)
    pack!
    show!)))

