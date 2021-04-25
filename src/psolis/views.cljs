(ns psolis.views
  (:require
   [re-frame.core :as re-frame]
   [psolis.events :as events]
   [psolis.routes :as routes]
   [psolis.subs :as subs]
   [psolis.webpage.config :refer [data]]
   [psolis.webpage.views.webpage :refer [webpage product-page]]
   ["react-bootstrap" :as bs]))


;; Ejemplos:
;;(defn home-panel []
;  (let [name (re-frame/subscribe [::subs/name])]
;    [:div
;     (webpage data)
;     (comment[:h1
;      (str "Hello from " @name ". This is the Home Page.")]
;     [:div
;      [:a {:on-click #(re-frame/dispatch [::events/navigate :about])}
;       "go to About Page"]])
;     ]))
;
;(defmethod routes/panels :home-panel [] [home-panel])
;;; about
;(defn about-panel []
;  [:div
;   [:h1 "This is the About Page."]
;   [:a {:href "/"} "click aquí para ir a test"]
;   [:div#test [:p "Destino:Test"]]
;   [:div
;    [:a {:on-click #(re-frame/dispatch [::events/navigate :home])}
;     "go to Home Page"]]])
;
;(defmethod routes/panels :about-panel [] [about-panel])
;;
;; Fin de ejemplos.

(defn webpage-panel []
  (webpage data))

(defn product-panel []
  (product-page data))


(defmethod routes/panels :home-panel [] [webpage-panel])
(defmethod routes/panels :product-panel [] [product-panel])

;; main

(defn main-panel []
  (let [active-panel (re-frame/subscribe [::subs/active-panel])]
    (routes/panels @active-panel)))
