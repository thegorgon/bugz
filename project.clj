(defproject bugz "0.1.0-SNAPSHOT"
  :description "A Fun Clojure Game With Battling Bugs"
  :url "http://https://github.com/thegorgon/bugz"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [seesaw "1.4.4"]]
  :main ^:skip-aot bugz.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
