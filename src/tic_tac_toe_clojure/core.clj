(ns tic-tac-toe-clojure.core
  (:gen-class))

(def board [[:e :x :e]
            [:o :o :o]
            [:x :e :x]])

(defn solve [x]
  (let [[[a b c]
         [d e f]
         [g h i]] x]
    (println a b c d e f g h i)))

(defn -main []
  (println "Hello, World!"))
