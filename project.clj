(defproject todo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.7.0"]
                 [hiccup "1.0.5"]
                 [ring/ring-core "1.10.0"]
                 [ring/ring-json "0.5.1"]
                 [korma "0.5.0-RC1"]
                 [mysql/mysql-connector-java "5.1.6"]
                 [ring/ring-defaults "0.3.4"]
                 [lynxeyes/dotenv "1.1.0"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler todo.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}}
  :repositories {"clojars" "https://clojars.org/repo/"})
