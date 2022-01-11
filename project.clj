(defproject broken-app "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.879"]
                 [re-frame "1.2.0"]
                 [reagent "1.1.0"
                  :exclusions [cljsjs/react
                               cljsjs/react-dom
                               cljsjs/react-dom-server]]]
  :resource-paths ["resources" "target"]
  :source-paths ["src/cljs"]
  :aliases {"fig" ["trampoline" "run" "-m" "figwheel.main" "-b" "dev" "-r"]}
  :profiles
  {:dev     {:dependencies   [[com.bhauman/figwheel-main "0.2.14"]
                              [day8.re-frame/re-frame-10x "1.2.1"]
                              [day8.re-frame/tracing "0.6.2"]]}})
