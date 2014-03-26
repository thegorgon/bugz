(ns bugz.world)

(defn empty [width height]
  (vec (repeatedly height
                   (fn [] (vec (repeatedly width (fn [] (ref {}))))))))

(defn tile-at [world x y]
  ((world y) x))

(defn neighborhood [world x y r]
  (for [dx (range (- r) r) dy (range (- r) r)
        :let [x' (+ x dx) y' (+ y dy)]
        :when (and (not (neg? x')) (not (neg? y')))]
    [[dx dy] (tile-at world x' y')]))
