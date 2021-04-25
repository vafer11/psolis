(ns psolis.webpage.views.components
  (:require ["react-bootstrap" :as bs]))

(defn nav-item-click [id in-page-navigation]
  (if in-page-navigation
    (when-let [element (.getElementById js/document (str "h1-" id))] (.scrollIntoView element))
    (when-let [element (.getElementById js/document id)] (set! (.-href element) "/"))))

(defn navbar [{:keys [brand src links]} in-page-navigation]
  [:> bs/Navbar {:variant "dark bg-super-black"
                 :expand "lg"
                 :fixed "top"}
   [:> bs/Navbar.Brand {:class "font-weight-bold"} brand]
   [:> bs/Navbar.Toggle {:aria-controls "basic-navbar-nav"}]
   [:> bs/Navbar.Collapse {:id "basic-navbar-nav"
                           :className "justify-content-center text-uppercase"}
    [:> bs/Nav {:className "mr-auto"}
     (for [anchor links]
       ^{:key anchor}
       [:> bs/Nav.Link {:onClick #(nav-item-click anchor in-page-navigation)
                        :className "text-white"
                        :id anchor} anchor])]
    [:> bs/Form
     [:> bs/Button {:variant "outline-info"} "Login"]]]])

(defn carousel [items]
  [:> bs/Carousel
   (for [{:keys [id name desc src]} items]
     ^{:key id}
     [:> bs/Carousel.Item
      [:img {:class "d-block w-100 carousel-picture"
             :alt name
             :src src}]
      [:> bs/Carousel.Caption
       [:h3 name]
       [:p desc]]])])

(defn card [{:keys [title text img alt]}]
  [:> bs/Card
   [:> bs/Card.Img {:variant "top"
                    :src img
                    :alt alt}]
   [:> bs/Card.Body
    [:> bs/Card.Title title]
    [:> bs/Card.Text text]]])

(defn coll-of-cards [items]
  [:<> (for [item items]
    ^{:key (:id item)}
    [:div {:class "col-lg-3 col-md-6 d-flex justify-content-center mb-1"}
     [card item]])])