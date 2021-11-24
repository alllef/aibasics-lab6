(ns aibasics-lab6.core)

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

(defn pow
  [num power]
  (if (> power 1)
    (recur (* num num) (dec power))
    num))

(defn disp-sum
  [numbers average start-value]
  (if (> (count numbers) 0)
    (recur (rest numbers) average
           (+ start-value (pow (- (first numbers) average) 2)))
           start-value)
    )

  (defn dispersion
    [numbers]
    (let [average (average-sum numbers)
          ]
      (/ (disp-sum numbers average 0) (count numbers)))
    )

(println (dispersion '(33 6)))