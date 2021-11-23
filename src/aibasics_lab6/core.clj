(ns aibasics-lab6.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn calc-sum
  [numbers start-value]
  (if (> (count (rest numbers)) 0)
    (recur (rest numbers) (+ start-value (first numbers)))
    start-value))

(println  (calc-sum '(5 24 80) 0))

(defn print-sum
  [numbers]
  (if (> (count (rest numbers)) 0)
    (recur (rest numbers))
    (println numbers)))

;(print-sum '(5 24 80))
