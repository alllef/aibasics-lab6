(ns aibasics-lab6.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn calc-sum
  [numbers start-value]
  (if (> (count numbers) 0)
    (recur (rest numbers) (+ start-value (first numbers)))
    start-value))

(defn average-sum
  [numbers]
(/ (calc-sum numbers 0) (count numbers))
  )

(println (average-sum '(33 3 6)))

(defn print-sum
  [numbers]
  (if (> (count (rest numbers)) 0)
    (recur (rest numbers))
    (println numbers)))

;(print-sum '(5 24 80))