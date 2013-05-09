(ns polyglot.clojure.lists
	(:gen-class
	 :name polyglot.clojure.lists
	 :methods [#^{:static true} [carMessage [String] String]]
	)
)

(defn carMessage [car]
	(str car " Rocks!!"))

(defn -carMessage [car]
	(carMessage car)
)
