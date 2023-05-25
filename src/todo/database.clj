(ns todo.database
    (require 
    [korma.db :as korma]
    [dotenv :refer [env app-env]]))

(def db-connection-info
    (korma/mysql 
        {:classname "com.mysql.jdbc.Driver"
        :subprotocol "mysql"
        :user "root"
        :subname "//localhost:3306/menagerie"
        :password (env "PASS")}))

; set up korma
(korma/defdb db db-connection-info)

; Basicamente nesse arquivo database.clj temos a configuração 
; de Banco de Dados. Podemos pegar esses dados de DB de N 
; lugares, arquivos de configuração, variável de ambiente.