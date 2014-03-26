(ns bugz.core
  (:gen-class)
  (:use seesaw.core))


(defn build-world [] (atom {}))



;; {:sugar-spots
;;  [{:location [x y] :qty 100}]
;;  :trails
;;  :colonies
;;  [
;;   {:ants []
;;    :sugar 0
;;    :holes []}]}

(def x (ref 10))
(def y (ref 0))

(defn build-frame []
  (-> (frame :title "howdy"
             :width 400
             :height 400)))

(defn show-frame [f]
  (show! f))





(defn -main [& args])

