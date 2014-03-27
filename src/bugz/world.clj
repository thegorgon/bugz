(ns bugz.world)

(defn empty-world [width height]
  (vec (repeatedly height
                   (fn [] (vec (repeatedly width (fn [] {}))))))))

(defn world-height [world]
  (count world))

(defn world-width [world]
  (count (first world)))

(defn world-tile-at [world x y]
  ((world y) x))

(defn random-world-location [world]
  [(rand-int (world-width world)) (rand-int (world-height world))])

(defn world-neighborhood [world x y r]
  (for [dx (range (- r) r) dy (range (- r) r)
        :let [x' (+ x dx) y' (+ y dy)]
        :when (and (not (neg? x')) (not (neg? y')))]
    [[dx dy] (world-tile-at world x' y')]))

(defn new-bug [] {})

(defn world-with-bug [world [x y] bug]
  (let [tile (world-tile-at world x y)]
    (assoc-in world [y x] (assoc tile :bug bug))))

(defn world-with-random-bugs [world, count]
  (if (= count 0) world
    (world-with-random-bugs
      (world-with-bug world (random-world-location world) (new-bug)) (dec count))))

(defn initialize-world [width height bug-count]
  (let [world (empty-world width height)]
    (world-with-random-bugs world bug-count)))


