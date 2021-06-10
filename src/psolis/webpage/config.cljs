(ns psolis.webpage.config)

(def data
  {:navbar-items {:brand "Panadería Solis"
                  :src "img/logo2.png"
                  :links ["nosotros" "productos" "historia"]}

   :carousel-items [{:id "1"
                     :name "Panificación Artesanal"
                     :desc "Somos una panadería tradicional de elaboración 100% artesanal, respetamos  siempre los procesos de una FERMENTACIÓN LENTA Y NATURAL."
                     :src "/img/webp/slider-panaderia3.webp"}
                    {:id "2"
                     :name "Bizcochería"
                     :desc "Cada producto es único, hecho a mano con el sabor inigualable del HORNO A LEÑA."
                     :src "/img/webp/slider-reposteria3.webp"}
                    {:id "3"
                     :name "Rotisería"
                     :desc "Seleccionamos siempre ingredientes frescos de mercados locales para brindar un producto de excelente calidad."
                     :src "/img/webp/slider-rotiseria3.webp"}
                    {:id "4"
                     :name "Repostería"
                     :desc "Contamos con una pastelería fresca y variada para estar siempre presente en tus momentos de dulzura."
                     :src "/img/webp/slider-reposteria3.webp"}]

   :who-we-are-items {:data {:id "nosotros"
                             :title "Quienes Somos"
                             :desc "Panadería artesanal con más de 100 años de história, más de 50 años en la familia, parte del pequeño pueblo de Solís de Mataojo. Foco en la producción artesanal trabajando con horno a leña pero utilizando las últimas tecnologías en cuestión de producción"}
                      :images [{:id "1"
                              :src "/img/webp/slider-panaderia3.min.jpg"
                              :alt "Trabajo en frío"}
                             {:id "2"
                              :src "/img/webp/slider-reposteria3.min.jpg"
                              :alt "Horno a leña"}
                             {:id "3"
                              :src "/img/webp/slider-rotiseria3.min.jpg"
                              :alt "Elaboración de Panes"}]}

   :products-items {:id "productos"
                    :title "Nuestros Productos"
                    :desc "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquid ex ea commodi consequat."}

   :history-items {:data {:id "historia"
                          :title "Nuestra Historia"}
                   :paragraphs [{:id 1 :p "Hoy somos una Panadería llena de historia, en 1920 surgió la idea por el Sr. Felix Castro de fundar una Panadería de Pueblo.
                                           El 1 de Junio de 1920 salió la primera horneada, y desde entonces el tradicional horno a leña continúa interrumpidamente cocinando el pan de cada día."}
                                {:id 2 :p "Hoy como responsable de este momento de história queremos recordar a todos aquellos que han hecho posible estos mas de 100 de história."}
                                {:id 3 :p "Panadería Solis, desde 1920."}]
                   :img {:src "img/webp/historia.jpg"
                         :alt "Foto historia"}}

   :products {:cafeteria {:name "Cafetería"
                          :elements [{:id 1
                                      :title "Media Lunas"
                                      :text "Bizcocho de anis, mantequilla, azucar, y bla bla bla..."
                                      :img "/img/webp/cafeteria1.jpg"
                                      :alt "Foto de bizcocho de anis"}
                                     {:id 2
                                      :title "Bizcochos"
                                      :text "Pan de semillas de sésamo, sal,  azucar, y bla bla bla..."
                                      :img "/img/webp/cafeteria2.jpg"
                                      :alt "Foto de pan de sésamo"}
                                     {:id 3
                                      :title "Media Lunas"
                                      :text "Bizcocho de anis, mantequilla, azucar, y bla bla bla..."
                                      :img "/img/webp/cafeteria3.jpg"
                                      :alt "Foto de bizcocho de anis"}
                                     {:id 4
                                      :title "Donas"
                                      :text "Pan de semillas de sésamo, sal,  azucar, y bla bla bla..."
                                      :img "/img/webp/reposteria3.jpg"
                                      :alt "Foto de pan de sésamo"}]}

              :rotiseria {:name "Rotisería"
                          :elements [{:id 5
                                      :title "Alfajores"
                                      :text "Pan de semillas de sésamo, sal,  azucar, y bla bla bla..."
                                      :img "/img/webp/reposteria3.jpg"
                                      :alt "Foto de pan de sésamo"}
                                     {:id 6
                                      :title "Ojitos"
                                      :text "Pan de semillas de sésamo, sal,  azucar, y bla bla bla..."
                                      :img "/img/webp/reposteria2.jpg"
                                      :alt "Foto de pan de sésamo"}
                                     {:id 7
                                      :title "Donas"
                                      :text "Pan de semillas de sésamo, sal,  azucar, y bla bla bla..."
                                      :img "/img/webp/reposteria3.jpg"
                                      :alt "Foto de pan de sésamo"}
                                     {:id 8
                                      :title "Alfajores"
                                      :text "Pan de semillas de sésamo, sal,  azucar, y bla bla bla..."
                                      :img "/img/webp/reposteria2.jpg"
                                      :alt "Foto de pan de sésamo"}]}

              :panaderia {:name "Panadería"
                          :elements [{:id 9
                                      :title "Pan"
                                      :text "Pan de semillas de sésamo, sal,  azucar, y bla bla bla..."
                                      :img "/img/webp/rotiseria1.jpg"
                                      :alt "Foto de pan de sésamo"}
                                     {:id 10
                                      :title "Pan"
                                      :text "Pan de semillas de sésamo, sal,  azucar, y bla bla bla..."
                                      :img "/img/webp/rotiseria2.jpg"
                                      :alt "Foto de pan de sésamo"}
                                     {:id 11
                                      :title "Pan"
                                      :text "Pan de semillas de sésamo, sal,  azucar, y bla bla bla..."
                                      :img "/img/webp/rotiseria1.jpg"
                                      :alt "Foto de pan de sésamo"}
                                     {:id 12
                                      :title "Pan"
                                      :text "Pan de semillas de sésamo, sal,  azucar, y bla bla bla..."
                                      :img "/img/webp/rotiseria2.jpg"
                                      :alt "Foto de pan de sésamo"}]}

              :reposteria {:name "Repostería"
                           :elements [{:id 13
                                       :title "Donas"
                                       :text "Pan de semillas de sésamo, sal,  azucar, y bla bla bla..."
                                       :img "/img/webp/reposteria3.jpg"
                                       :alt "Foto de pan de sésamo"}
                                      {:id 14
                                       :title "Donas"
                                       :text "Pan de semillas de sésamo, sal,  azucar, y bla bla bla..."
                                       :img "/img/webp/reposteria3.jpg"
                                       :alt "Foto de pan de sésamo"}
                                      {:id 15
                                       :title "Donas"
                                       :text "Pan de semillas de sésamo, sal,  azucar, y bla bla bla..."
                                       :img "/img/webp/reposteria3.jpg"
                                       :alt "Foto de pan de sésamo"}
                                      {:id 16
                                       :title "Donas"
                                       :text "Pan de semillas de sésamo, sal,  azucar, y bla bla bla..."
                                       :img "/img/webp/reposteria3.jpg"
                                       :alt "Foto de pan de sésamo"}]}}

   :footer-items {:data {:title "Panadería Solis"
                         :desc "Ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod sectetur sectetur elit, sed do secteturelit, sed do sectetur sectetur."}
                  :location {:title "Ubicación"
                             :map "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3284.038079991865!2d-55.46843320857417!3d-34.60319857380939!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x950aaaf37da4cca1%3A0x33647da39b82c2ae!2sPANADER%C3%8DA%20SOLIS!5e0!3m2!1ses-419!2suy!4v1618105784777!5m2!1ses-419!2suy"}
                  :contact {:title "Contacto"
                            :direction "Solis de Mataojo, Lavalleja"
                            :mail "panaderia.solis@gmail.com"
                            :phone "4447 4011"
                            :cell-phone "099 66 10 84"}
                  :social {:facebook "https://www.facebook.com/solispanaderia/"
                           :instagram "https://www.instagram.com/panaderia_solis/"}}})
