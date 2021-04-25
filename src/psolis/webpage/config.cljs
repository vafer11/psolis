(ns psolis.webpage.config)

(def data
  {:navbar-items {:brand "Panadería Solis"
                  :src "img/logo2.png"
                  :links ["inicio" "nosotros" "productos" "historia"]}

   :carousel-items [{:id "1"
                     :name "Panificación Artesanal"
                     :desc "Somos una panadería tradicional de elaboración 100% artesanal, respetamos  siempre los procesos de una FERMENTACIÓN LENTA Y NATURAL."
                     :src "/img/slice1.jpg"}
                    {:id "2"
                     :name "Bizcochería"
                     :desc "Cada producto es único, hecho a mano con el sabor inigualable del HORNO A LEÑA."
                     :src "/img/slice2.jpg"}
                    {:id "3"
                     :name "Rotisería"
                     :desc "Seleccionamos siempre ingredientes frescos de mercados locales para brindar un producto de excelente calidad."
                     :src "/img/slice3.jpg"}
                    {:id "4"
                     :name "Repostería"
                     :desc "Contamos con una pastelería fresca y variada para estar siempre presente en tus momentos de dulzura."
                     :src "/img/slice2.jpg"}]

   :who-we-are-items {:data {:id "nosotros"
                             :title "Quienes Somos"
                             :desc "Panadería artesanal con más de 100 años de história, más de 50 años en la familia, parte del pequeño pueblo de Solís de Mataojo. Foco en la producción artesanal trabajando con horno a leña pero utilizando las últimas tecnologías en cuestión de producción"}
                      :images [{:id "1"
                              :src "/img/slice1.jpg"
                              :alt "Trabajo en frío"}
                             {:id "2"
                              :src "/img/slice2.jpg"
                              :alt "Horno a leña"}
                             {:id "3"
                              :src "/img/slice3.jpg"
                              :alt "Elaboración de Panes"}]}

   :products-items {:id "productos"
                    :title "Nuestros Productos"
                    :desc "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed eiusmod tempor incidunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquid ex ea commodi consequat."}

   :history-items {:data {:id "historia"
                          :title "Nuestra Historia"}
                   :paragraphs [{:id 1 :p "Ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua ut enim ad minim veniam."}
                                {:id 2 :p "Ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua ut enim ad minim veniam."}
                                {:id 3 :p "Ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua ut enim ad minim veniam."}
                                {:id 4 :p "Ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua ut enim ad minim veniam."}]
                   :img {:src "img/historia.png"
                         :alt "Foto historia"}}
   :products [{:id 1
               :title "Bizcocho"
               :text "Bizcocho de anis, mantequilla, azucar, y bla bla bla..."
               :img "/img/img2.png"
               :alt "Foto de bizcocho de anis"}
              {:id 2
               :title "Pan"
               :text "Pan de semillas de sésamo, sal,  azucar, y bla bla bla..."
               :img "/img/img4.png"
               :alt "Foto de pan de sésamo"}
              {:id 3
               :title "Bizcocho"
               :text "Bizcocho de anis, mantequilla, azucar, y bla bla bla..."
               :img "/img/img2.png"
               :alt "Foto de bizcocho de anis"}
              {:id 4
               :title "Pan"
               :text "Pan de semillas de sésamo, sal,  azucar, y bla bla bla..."
               :img "/img/img4.png"
               :alt "Foto de pan de sésamo"}]

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
