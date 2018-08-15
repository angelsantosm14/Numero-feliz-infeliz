(ns clj12161406.numero
  (:require [clj12161406.fos :as fos] :reload )
  )

;SANTOS MARTINEZ ANGEL
;GRPO: ISA 
;NUMERO DE CONTROL: 12161406

(defn feliz? [x]
  (if (pos? x)
    (fos/iteración x)
    false
    )
  )

(defn infeliz? [x]
  (not (feliz? x))
  )

(defn felices? [x]
  
  (if (empty? x)
    false
    (fos/vreduce x true (fn [a b] (and a (feliz? b))) ))
  )

(defn infelices? [x]
  (if (empty? x)
    true
    (fos/vreduce x true (fn [a b] (and a (infeliz? b))) ))
  
  )