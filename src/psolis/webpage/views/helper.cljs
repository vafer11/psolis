(ns psolis.webpage.views.helper
  (:require [psolis.webpage.events :as events]
            [re-frame.core :refer [dispatch]]))

(defn scrollTo [element-id]
  (->> element-id
    (.getElementById js/document)
    (.scrollIntoView)))

(defn nav-item-click [id in-page-navigation]
      (if in-page-navigation
        (when-let [element (.getElementById js/document (str "h1-" id))] (.scrollIntoView element))
        (when-let [element (.getElementById js/document id)]
                  (set! (.-href element) "/")
                  (dispatch [::events/set-hash (str "#" id)]))))
