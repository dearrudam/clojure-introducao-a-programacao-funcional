(ns curso.aula4)

(def precos [50 100 10000])

(println (precos 0))

; acessa direto o valor dado um index.
; A exceção IndexOutOfBoundsException será lançada caso a posição estiver
; fora do range do vetor

;(println (precos 99))

;utilizando a função "get", caso o index informado estiver
;fora do range do vetor, então "nil" será retornado, evitando assim a necessidade
;de tratar a exceção, porém será necessário chegar o retorno.
(println (get precos 99))

;a função get fornece um argumento adicional que é o valor default caso
;o index informado estiver fora do range do vetor. Muito útil!
(println (get precos 88 8))

;caso o index exista no vetor, o valor default será ignorado
(println (get precos 0 888888))

;atualizando um valor relacionado a um índice no vetor

;*função "update" expera uma funcão no 2o. argumento
;(println (update precos 0 12))
;* inc é uma função built-in do clojure
(println (update precos 0 inc))
;* dec é uma função built-in do clojure
(println (update precos 0 dec))

;sendo que o valor do simbolo é imutável.
;sempre que alteramos esse valor, um novo valor é gerado sem alterar o anterior:
; IMUTABILIDADE
(println (conj precos 10))
(println precos)


;criando uma função inc
(defn soma-1
  [valor]
  (println "estou somando um em" valor)
  (+ valor 1))

(println (soma-1 10))

(println (update precos 0 soma-1))

(defn soma-3
  [valor]
  (println "estou somando 3 em" valor)
  (+ valor 3))

(println (soma-3 10))

(println (update precos 0 soma-3))

