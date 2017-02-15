(ns example.first-test
  (:require [clojure.test :refer :all]))

(deftest passing
  (is (= 0 0))
  (is (= 0 0)))

(deftest nested
  (testing "outer"
    (testing "inner"
      (is (= 0 0)))))

(deftest failing
  (is (= 0 1)))

(deftest failing-with-message
  (is (= 0 1) "Something went horribly wrong"))

(deftest failing-with-context
  (testing "when testing"
    (testing "with context"
      (is (= 0 1)))))

(deftest failing-with-context-and-message
  (testing "when testing"
    (testing "with context"
      (is (= 0 1) "Something went horribly wrong"))))

(deftest erroring
  (is (= 0 (/ 0 0))))

(deftest erroring-with-context
  (testing "when testing"
    (testing "with context"
      (is (= 0 (/ 0 0))))))
