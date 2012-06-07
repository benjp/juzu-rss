@org.juzu.Application

@Assets(
        scripts = {
                @Script(src = "js/jquery-1.7.1.min.js")
        },
        stylesheets = {
                @Stylesheet(src = "css/simple-rss.css")
        }
)
package org.gatein.portal.rss;

import org.juzu.plugin.asset.Assets;
import org.juzu.plugin.asset.Script;
import org.juzu.plugin.asset.Stylesheet;