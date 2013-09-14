(ns polyglot.clojure.sample
	(:gen-class
	 :name polyglot.clojure.sample.ClojureUtils
	 :methods [

      [lowerit [String] String]
      [doubleThirdValue [java.util.List] Integer]

      #^{:static true} [upperit [String] String]

    ]
	)
  (:require [clojure.string :as st])
)

(defn -lowerit [this message]
  (st/lower-case message))

(defn -upperit [message]
  (st/upper-case message))

(defn -doubleThirdValue [this [_ _ third]]
  (* 2 third))


