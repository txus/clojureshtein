(ns clojureshtein.test.core
  (:use [clojureshtein.core])
  (:use [clojure.test]))

(deftest hello
   (is 5 (levenshtein "hello" "hola")))
