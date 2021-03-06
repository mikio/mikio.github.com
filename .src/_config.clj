{
 ;; directory setting
 ;;   defailed information: http://liquidz.github.io/misaki/toc/02-directory-structure.html
 :public-dir   "../"
 :tag-out-dir  "tag/" ;; => {public-dir}/{tag-outdir}/{tag}.html
 :template-dir "template/" ;; => ./{template-dir}
 :post-dir     "posts/"    ;; => ./{template-dir}/{post-dir}
 :layout-dir   "layouts/"  ;; => ./{template-dir}/{layout-dir}
 :tag-layout   "tag"       ;; => ./{template-dir}/{layout-dir}/{tag-layout}.html
 :post-filename-regexp #"^.+$"
 ;;:post-filename-format "$(year)-$(month)/$(filename)"
 :post-filename-format "article/$(year)/$(month)/$(day)_$(filename)" ;; o-blog format
 :compile-with-post ["index.html" "archives.html" "atom.xml"]
 :url-base "/"
 :posts-per-page 10
 :recent-posts-num 5
 :emacs "/usr/local/bin/emacs"
 :lang "ja"

 :site {:site-title    "ざる魂"
        :site-subtitle "真似て学んで「まねぶ」サル。知られざる我が魂。" 
        :your-domain   "mikio.github.io"
        :atom          "atom.xml"
        :atom-base     "http://mikio.github.io"
        :twitter-id    "mikio_kun"
        :disqus-id     "mikiokunblog"
        :local {:css   ["css/main.css"]
                :js    [;;"js/ui.js"
                        "js/main.js"]}
        :remote {:css ["http://yui.yahooapis.com/pure/0.4.2/pure.css"
                       ]}}

 ;; misaki-orgmode configuration
 ;; cuma extension file
 :cuma {:extension "extension.clj"}

 :compiler ["orgmode"] 
}

