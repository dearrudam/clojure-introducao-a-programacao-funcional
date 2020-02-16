(ns curso.aula2)

(defn imprime-mensagem []
  (println "-----------------------------------")
  (println "Bem vindo(a) ao estoque!"))


(defn valor-descontado
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (let [desconto (/ 10 100)]
    (println "Calculando desconto de" desconto)
    (* valor-bruto (- 1 desconto))))

(println "Valor descontado de 100 =" (valor-descontado 100))

(defn valor-descontado
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (let [desconto 0.10]
    (println "Calculando desconto de" desconto)
    (* valor-bruto (- 1 desconto))))

(println "Valor descontado de 100 =" (valor-descontado 100))


(println "90.0 é do tipo" (class 90.0))
(println "90N é do tipo" (class 90N))
(println "90M é do tipo" (class 90M))

(println
  (class 90))

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor for estritamente maior que 100."
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (println "Calculando desconto de" desconto)
      (- valor-bruto desconto))
    valor-bruto))


(println "Valor descontado de 1000 =" (valor-descontado 1000))
(println "Valor descontado de 100 =" (valor-descontado 100))
(println "Valor descontado de 99 =" (valor-descontado 99))

(if nil (println "true") (println "nil or false é sempre FALSO"))
