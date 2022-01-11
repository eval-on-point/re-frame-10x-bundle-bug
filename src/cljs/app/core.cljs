(ns ^:figwheel-hooks app.core
  (:require
   [day8.re-frame.tracing :refer [fn-traced]]
   [goog.dom :as gdom]
   [reagent.dom :as rdom]
   [re-frame.core :as rf]))

(rf/reg-event-db ::next
 (fn-traced [_ _]
            {}))

(rf/reg-event-fx ::init
 (fn-traced [_ _]
            {:dispatch [::next]}))

(defn mount-root []
  ;; (rdom/render [:div "content"] (gdom/getElement "app"))
  )

(defn ^:export init []
  (mount-root)
  (rf/dispatch-sync [::init]))
