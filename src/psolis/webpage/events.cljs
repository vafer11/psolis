(ns psolis.webpage.events
  (:require [re-frame.core :refer [reg-event-db]]))

(reg-event-db
  ::set-hash
  (fn [db [_ hash]]
    (assoc db :hash hash)))


