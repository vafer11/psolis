(ns psolis.webpage.views.components
  (:require ["react-bootstrap" :as bs]
            [psolis.webpage.views.helper :as helper]))

(defn navbar [{:keys [brand src links]} in-page-navigation]
  [:> bs/Navbar {:variant "dark bg-super-black"
                 :expand "lg"
                 :fixed "top2"}
   [:> bs/Navbar.Brand {:class "font-weight-bold"}
    [:img {:src "/img/webp/logo2.png"
           :height "35"}]
    ]
   [:> bs/Navbar.Toggle {:aria-controls "basic-navbar-nav"}]
   [:> bs/Navbar.Collapse {:id "basic-navbar-nav"
                           :className "justify-content-center text-uppercase"}
    [:> bs/Nav {:className "mr-auto"}
     (for [anchor links]
       ^{:key anchor}
       [:> bs/Nav.Link {:onClick #(helper/nav-item-click anchor in-page-navigation)
                        :className "text-white"
                        :id anchor} anchor])]
    [:> bs/Form
     [:> bs/Button {:variant "outline-info invisible"} "Login"]]]])

(defn carousel [items]
  [:> bs/Carousel
   (for [{:keys [id name desc src]} items]
     ^{:key id}
     [:> bs/Carousel.Item
      [:img {:class "d-block w-100 carousel-picture img-responsive"
             :alt name
             :src src}]
      [:> bs/Carousel.Caption
       [:h3.carousel-picture-title name]
       [:p.carousel-picture-desc desc]]
      (comment)
      ])])

(defn card [{:keys [title text img alt]}]
  [:> bs/Card
   [:> bs/Card.Img {:variant "top"
                    :src img
                    :alt alt}]
   [:> bs/Card.Body
    [:> bs/Card.Title title]
    [:> bs/Card.Text text]]])

(defn coll-of-cards [desc items]
  [:<>
   [:div.row.mt-5.mb-3  [:div.col [:hr]]  [:div.col-auto [:h5 desc]]  [:div.col [:hr]]]
   [:div.row
    (for [item items]
         ^{:key (:id item)}
         [:div {:class "col-lg-3 col-sm-6 d-flex justify-content-center mb-1"}
          [card item]])]])

(defn simple-footer []
  [:footer {:class "bg-super-black text-center text-white"}
   [:div {:class "container-fluid"}
    [:br]
    [:div {:class "row"}
     [:div {:class "col pb-3"}
      [:p "?? 2020 Copyright Panader??a Solis."]]]]])