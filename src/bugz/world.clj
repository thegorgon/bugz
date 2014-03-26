(ns bugz.world)

(defn empty [width height]
  (vec (repeat height (vec (repeat width (ref {}))))))

(defn tile-at [world x y]
  ((world y) x))
