(ns bugz.core
  (:gen-class)
  (:use seesaw.core))

(defn -main [& args]
  (invoke-later
    (-> (frame :title "Hello",
            :content "Hellow, Seesaw",
            :on-close :exit)
    pack!
    show!)))

