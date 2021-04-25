(ns psolis.webpage.views.webpage
  (:require ["react-bootstrap" :as bs]
            [re-frame.core :as re-frame]
            [psolis.events :as events]
            [psolis.webpage.views.components :refer [navbar carousel coll-of-cards]]))

(defn who-we-are [{:keys [data images]}]
  [:div {:class "container-fluid text-center"}
   [:div {:class "row justify-content-center"}
    [:div {:class "col-8"}
     [:h1 {:class "text-uppercase anchor" :id (str "h1-" (:id data))} (:title data)]
     [:p {:class "lead mt-5"} (:desc data)]]]
   [:div.row
    (for [{:keys [id alt src]} images]
      ^{:key id}
      [:div {:class "col-lg-4 d-flex justify-content-center"}
       [:img.d-block.w-100.mb-1 {:src src :alt alt}]])]])

(defn products [data]
  [:div {:class "container-fluid text-center"}
   [:div {:class "row justify-content-center"}
    [:div {:class "col-8"}
     [:h1 {:class "text-uppercase anchor" :id (str "h1-" (:id data))} (:title data)]
     [:p {:class "lead mt-5"} (:desc data)]]]
   [:> bs/Button
    {:variant "outline-dark"
     :onClick #(re-frame/dispatch [::events/navigate :product])}
    "Ver Productos"]])

(defn history [{:keys [data paragraphs img]}]
  [:div {:class "container-fluid text-center"}
   [:div {:class "row justify-content-center"}
    [:div {:class "col-8"}
     [:h1 {:class "text-uppercase anchor" :id (str "h1-" (:id data))} (:title data)]]]
   [:div.row.history-container.mt-5
    [:div.col-lg.d-flex.align-items-center
     [:div.container-fluid
      (for [{:keys [id p]} paragraphs]
        ^{:key id}
        [:p.lead.text-left p])]]
    [:div.col-lg
     [:img.d-block.w-100.history-picture img]]]])

(defn footer [{:keys [data location contact social]}]
  [:footer {:class "bg-super-black text-center text-white"}
   [:div {:class "container-fluid"}
    [:div {:class "row pt-4"}
     [:div {:class "col-sm-12 col-lg-4 mt-3"}
      [:h6 {:class "text-uppercase mb-4 font-weight-bold"} (:title data)]
      [:p (:desc data)]
      [:p "Siguenos en"]
      [:a {:class " dark bi bi-instagram p-2"
           :href (:instagram social)}]
      [:a {:class "bi bi-facebook p-2"
           :href (:facebook social)}]]
     [:div {:class "col-sm-12 col-lg-4 mt-3"}
      [:h6 {:class "text-uppercase mb-4 font-weight-bold"} (:title contact)]
      [:p [:i {:class "bi bi-house mr-3"}] (:direction contact)]
      [:p [:i {:class "bi bi-envelope mr-3"}] (:mail contact)]
      [:p [:i {:class "bi bi-telephone mr-3"}] (:phone contact)]
      [:p [:i {:class "bi bi-phone mr-3"}] (:cell-phone contact)]]
     [:div {:class "col-sm-12 col-lg-4 mt-3"}
      [:h6 {:class "text-uppercase mb-4 font-weight-bold"} (:title location)]
      [:div {:class "z-depth-1-half map-container"}
       [:iframe {:src (:map location)
                 :frameBorder "0"
                 :allowFullScreen 1}]]]]
    [:br]
    [:div {:class "row"}
     [:div {:class "col pb-3"}
      [:p "© 2020 Copyright Panadería Solis."]]]]])


(defn webpage [{:keys [navbar-items carousel-items who-we-are-items products-items history-items footer-items]}]
  [:div
   [navbar
    (update-in navbar-items [:links] rest)                  ;Remove First Link "Home"
    true]
   [:div.mb-5 [carousel carousel-items]]
   [:div.p-5  [who-we-are who-we-are-items]]
   [:div.p-5 [products products-items]]
   [:div.bg-light.border-top.p-5 [history history-items]]
   [:div.bg-super-black.pr-5.pl-5.pt-5 [footer footer-items]]])

(defn product-page [{:keys [navbar-items footer-items products]}]
  [:div
   [navbar
    (update-in navbar-items [:links] #(list (first %1)))    ; Take just "Home" link
    false]
   [:div.container-fluid.mt-5
    [:div.row.justify-content-center
     [:h1.text-uppercase.anchor "Nuestros Productos"]
     [:div.p-5 [:div.row [coll-of-cards products]]]
     [:div.p-5 [:div.row [coll-of-cards products]]]
     [:div.p-5 [:div.row [coll-of-cards products]]]
     [:div.p-5 [:div.row [coll-of-cards products]]]]]
   [:div.bg-super-black.pr-5.pl-5.pt-5 [footer footer-items]]])