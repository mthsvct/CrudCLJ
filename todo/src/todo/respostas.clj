(ns todo.respostas
    (:require [todo.database]
        [korma.core :refer :all]))

(defn deleteResposta [r]
    (cond 
        (= r 1) {:res "Item deletado com sucesso!"}
        (= r 0) {:res "Erro!"}))

(defn updateResposta [r]
    (cond 
        (= r 1) {:res "Item atualizado com sucesso!"}
        (= r 0) {:res "Erro!"}))