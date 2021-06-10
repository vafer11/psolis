(ns psolis.webpage.views.webpage
  (:require ["react-bootstrap" :as bs]
            [re-frame.core :as re-frame]
            [reagent.core :as reagent]
            [re-frame.core :refer [dispatch subscribe]]
            [psolis.webpage.subs :as subs]
            [psolis.events :as events]
            [psolis.webpage.views.helper :as helper]
            [psolis.webpage.views.components :refer [navbar carousel coll-of-cards]]))

(defn who-we-are [{:keys [data images]}]
  [:div {:class "container-fluid"}
   [:div {:class "row justify-content-center text-center"}
    [:div {:class "col-12 col-md-12 col-lg-8"}
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
    [:div {:class "col-12 col-md-12 col-lg-8"}
     [:h1 {:class "text-uppercase anchor" :id (str "h1-" (:id data))} (:title data)]
     [:p {:class "lead mt-5"} (:desc data)]]]
   [:> bs/Button
    {:variant "outline-dark"
     :onClick #(dispatch [::events/navigate :product])}
    "Ver Productos"]])

(defn history [{:keys [data paragraphs img]}]
  [:div {:class "container-fluid"}
   [:div {:class "row justify-content-center text-center"}
    [:div {:class "col-12 col-md-12 col-lg-8"}
     [:h1 {:class "text-uppercase anchor" :id (str "h1-" (:id data))} (:title data)]]]
   [:div.row.history-container.mt-5
    [:div.col-lg.d-flex.align-items-center
     [:div.container-fluid.text-center
      (for [{:keys [id p]} paragraphs]
        ^{:key id}
        [:p.lead p])]]
    [:div.col-lg.d-flex.justify-content-center
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
  (let [hash @(subscribe [::subs/hash])
        nav-comp [navbar navbar-items true]
        carousel-comp [carousel carousel-items]
        who-we-are-comp [who-we-are who-we-are-items]
        products-comp [products products-items]
        history-comp [history history-items]
        footer-comp [footer footer-items]]
    (reagent/create-class
      {:component-did-mount
       (fn []
         (case hash
           "#nosotros" (helper/scrollTo "h1-nosotros")
           "#productos" (helper/scrollTo "h1-productos")
           "#historia" (helper/scrollTo "h1-historia")
           "default"))
       :display-name "webpage component"
       :reagent-render
       (fn [{:keys [navbar-items carousel-items who-we-are-items products-items history-items footer-items]}]
         [:div
          nav-comp
          [:div.mb-5 carousel-comp]
          [:div.p-3  who-we-are-comp]
          [:div.p-3 products-comp]
          [:div.bg-light.border-top.p-3 history-comp]
          [:div.bg-super-black.pr-3.pl-3.pt-5 footer-comp]])})))

(defn product-page [{:keys [navbar-items footer-items products]}]
  (let [nav [navbar navbar-items false]
        cafeteria [coll-of-cards
                   (get-in products [:cafeteria :name])
                   (get-in products [:cafeteria :elements])]
        panaderia [coll-of-cards
                   (get-in products [:panaderia :name])
                   (get-in products [:panaderia :elements])]
        rotiseria [coll-of-cards
                   (get-in products [:rotiseria :name])
                   (get-in products [:rotiseria :elements])]
        reposteria [coll-of-cards
                   (get-in products [:reposteria :name])
                   (get-in products [:reposteria :elements])]

        footer-section [footer footer-items]]
    (reagent/create-class
      {:component-did-mount
                     (fn []
                         (.scrollTo js/window 0 0))
       :display-name "product-page"
       :reagent-render
                     (fn [{:keys [navbar-items footer-items products]}]
                         [:div
                          nav
                          [:div.container-fluid.mt-5.text-center
                           [:div.row.justify-content-center
                            [:div {:class "col-12 col-md-12 col-lg-8"}
                             [:h1.text-uppercase.anchor "Nuestros Productos"]]]
                           [:div.row.justify-content-center
                            [:div.p-5
                             cafeteria
                             panaderia
                             rotiseria
                             reposteria]]]
                          [:div.bg-super-black.pr-5.pl-5.pt-5 footer-section]])})))

