(ns ^:figwheel-hooks app.core
  (:require
   [day8.re-frame.tracing :refer [fn-traced]]
   [re-frame.core :as rf]))

(rf/reg-event-fx ::init
 (fn-traced [_ _] {}))

(defn ^:export init []
  (rf/dispatch [::init])
  (rf/dispatch [::init]))
