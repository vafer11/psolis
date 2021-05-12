(ns psolis.webpage.subs
  (:require [re-frame.core :refer [reg-sub]]))

(reg-sub
  ::hash
  (fn [db _]
    (:hash db)))



