(ns clj12161406.fos)


(defn vreduce [x vinicial funcion]
  (letfn [(recursiva [xs ys g]
            (if (empty? xs)
              ys
              (recursiva (rest xs) (g ys (first xs)) g )
              
              )
            )] (recursiva x vinicial funcion))
  )



(defn mapear [x]
  ({\1 1 \2 2 \3 3 \4 4 \5 5 \6 6 \7 7 \8 8  \9 9 \0 0}x)
  )

(defn convertir-vector [x]
  (vreduce (str x) [] (fn [ a b] (conj a (* (mapear b) (mapear b)))))
  )

(defn sumar-vector [x]
             (vreduce x 0 (fn [a b] (+ a b)))  
              )


(defn iteración [x]
 (letfn [(recursiva [xs i valor]
            (if (or (== xs 1 ) (> i 9))
              valor
              (recursiva (sumar-vector(convertir-vector xs)) (inc i) (if (> i 8) false true))
              )
            )] (recursiva x  1 true))
  )
