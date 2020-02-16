(ns curso.aula3)

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor for estritamente maior que 100."
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))


(println "Valor descontado para o valor 1000 =" (valor-descontado 1000))
(println "Valor descontado para o valor 100 =" (valor-descontado 100))
(println "Valor descontado para o valor 99 =" (valor-descontado 99))

;PREDICATE

(defn aplica-desconto?
  [valor-bruto]
  (println "aplica-desconto versao 1")
  (if (> valor-bruto 100)
    true
    false))

(println "Valor descontado para o valor 1000 =" (valor-descontado 1000))
(println "Valor descontado para o valor 100 =" (valor-descontado 100))


(defn aplica-desconto?
  [valor-bruto]
  (println "aplica-desconto versao when")
  (when (> valor-bruto 100)
    true))

(println "Valor descontado para o valor 1000 =" (valor-descontado 1000))
(println "Valor descontado para o valor 100 =" (valor-descontado 100))

(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(println "Valor descontado para o valor 1000 =" (valor-descontado 1000))
(println "Valor descontado para o valor 100 =" (valor-descontado 100))


;funções com muitos caminhos de execução aumenta a complexidade (complexidade ciclomática)

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor for estritamente maior que 100."
  [aplica? valor-bruto]
  (if (aplica? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))


(defn mais-caro-que-100?
  [valor-bruto]
  (> valor-bruto 100))

(defn mais-caro-que-100?
  [valor-bruto]
  (> valor-bruto 100))

; Funções com parâmetros
(println "Valor descontado para o valor 1000 =" (valor-descontado mais-caro-que-100? 1000))
(println "Valor descontado para o valor 100 =" (valor-descontado mais-caro-que-100? 100))

; HIGH ORDER FUNCTIONS
; IMUTABILIDADE


(defn mais-caro-que-100? [valor-bruto] (> valor-bruto 100))

(println "função sem nome. anonima")
(println "Valor descontado para o valor 1000 =" (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 1000))
(println "Valor descontado para o valor 100 =" (valor-descontado (fn [valor-bruto] (> valor-bruto 100)) 100))
(println "Valor descontado para o valor 1000 =" (valor-descontado (fn [v] (> v 100)) 1000))
(println "Valor descontado para o valor 100 =" (valor-descontado (fn [v] (> v 100)) 100))
(println "Valor descontado para o valor 1000 =" (valor-descontado #(> %1 100) 1000))
(println "Valor descontado para o valor 1000 =" (valor-descontado #(> %1 100) 100))
(println "Valor descontado para o valor 1000 =" (valor-descontado #(> % 100) 1000))
(println "Valor descontado para o valor 1000 =" (valor-descontado #(> % 100) 100))
(println "Qto mais abreviado os símbolos, maior a ambiguidade" )
(println "conciso = mais claro. para ser claro não deve haver ambiguidades")


(def mais-caro-que-100? (fn [valor-bruto] (> valor-bruto 100)))
(def mais-caro-que-100? #(> % 100))

(println "Valor descontado para o valor 1000 =" (valor-descontado mais-caro-que-100? 1000))
(println "Valor descontado para o valor 100 =" (valor-descontado mais-caro-que-100? 100))




