/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2019-10-23 10:48:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.xava.editors;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chooseIcon_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/standard-jstlel.jar", Long.valueOf(1571826345427L));
    _jspx_dependants.put("jar:file:/C:/Users/javi/git/openxava/OpenXavaTest/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/fmt-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("jar:file:/C:/Users/javi/git/openxava/OpenXavaTest/web/WEB-INF/lib/standard-jstlel.jar!/META-INF/c-1_0.tld", Long.valueOf(1425975068000L));
    _jspx_dependants.put("/xava/editors/../imports.jsp", Long.valueOf(1571826345009L));
    _jspx_dependants.put("/WEB-INF/openxava.tld", Long.valueOf(1571826345431L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      org.openxava.web.style.Style style = null;
      style = (org.openxava.web.style.Style) _jspx_page_context.getAttribute("style", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (style == null){
        style = new org.openxava.web.style.Style();
        _jspx_page_context.setAttribute("style", style, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");
  
// Material Design Icons v1.9.32
// To upgrade copy the icon list from preview.html of the newer icon distribution

String [] icons = { "access-point", "access-point-network", "account", "account-alert", "account-box", "account-box-outline", "account-card-details", "account-check", "account-circle", "account-convert", "account-edit", "account-key", "account-location", "account-minus", "account-multiple", "account-multiple-minus", "account-multiple-outline", "account-multiple-plus", "account-network", "account-off", "account-outline", "account-plus", "account-remove", "account-search", "account-settings", "account-settings-variant", "account-star", "account-switch", "adjust", "air-conditioner", "airballoon", "airplane", "airplane-landing", "airplane-off", "airplane-takeoff", "airplay", "alarm", "alarm-check", "alarm-multiple", "alarm-off", "alarm-plus", "alarm-snooze", "album", "alert", "alert-box", "alert-circle", "alert-circle-outline", "alert-decagram", "alert-octagon", "alert-octagram", "alert-outline", "all-inclusive", "alpha", "alphabetical", "altimeter", "amazon", "amazon-clouddrive", "ambulance", "amplifier", "anchor", "android", "android-debug-bridge", "android-studio", "angular", "angularjs", "animation", "apple", "apple-finder", "apple-ios", "apple-keyboard-caps", "apple-keyboard-command", "apple-keyboard-control", "apple-keyboard-option", "apple-keyboard-shift", "apple-mobileme", "apple-safari", "application", "apps", "archive", "arrange-bring-forward", "arrange-bring-to-front", "arrange-send-backward", "arrange-send-to-back", "arrow-all", "arrow-bottom-left", "arrow-bottom-right", "arrow-compress", "arrow-compress-all", "arrow-down", "arrow-down-bold", "arrow-down-bold-box", "arrow-down-bold-box-outline", "arrow-down-bold-circle", "arrow-down-bold-circle-outline", "arrow-down-bold-hexagon-outline", "arrow-down-box", "arrow-down-drop-circle", "arrow-down-drop-circle-outline", "arrow-down-thick", "arrow-expand", "arrow-expand-all", "arrow-left", "arrow-left-bold", "arrow-left-bold-box", "arrow-left-bold-box-outline", "arrow-left-bold-circle", "arrow-left-bold-circle-outline", "arrow-left-bold-hexagon-outline", "arrow-left-box", "arrow-left-drop-circle", "arrow-left-drop-circle-outline", "arrow-left-thick", "arrow-right", "arrow-right-bold", "arrow-right-bold-box", "arrow-right-bold-box-outline", "arrow-right-bold-circle", "arrow-right-bold-circle-outline", "arrow-right-bold-hexagon-outline", "arrow-right-box", "arrow-right-drop-circle", "arrow-right-drop-circle-outline", "arrow-right-thick", "arrow-top-left", "arrow-top-right", "arrow-up", "arrow-up-bold", "arrow-up-bold-box", "arrow-up-bold-box-outline", "arrow-up-bold-circle", "arrow-up-bold-circle-outline", "arrow-up-bold-hexagon-outline", "arrow-up-box", "arrow-up-drop-circle", "arrow-up-drop-circle-outline", "arrow-up-thick", "assistant", "asterisk", "at", "atom", "attachment", "audiobook", "auto-fix", "auto-upload", "autorenew", "av-timer", "baby", "baby-buggy", "backburger", "backspace", "backup-restore", "bandcamp", "bank", "barcode", "barcode-scan", "barley", "barrel", "basecamp", "basket", "basket-fill", "basket-unfill", "battery", "battery-10", "battery-20", "battery-30", "battery-40", "battery-50", "battery-60", "battery-70", "battery-80", "battery-90", "battery-alert", "battery-charging", "battery-charging-100", "battery-charging-20", "battery-charging-30", "battery-charging-40", "battery-charging-60", "battery-charging-80", "battery-charging-90", "battery-minus", "battery-negative", "battery-outline", "battery-plus", "battery-positive", "battery-unknown", "beach", "beaker", "beats", "beer", "behance", "bell", "bell-off", "bell-outline", "bell-plus", "bell-ring", "bell-ring-outline", "bell-sleep", "beta", "bible", "bike", "bing", "binoculars", "bio", "biohazard", "bitbucket", "black-mesa", "blackberry", "blender", "blinds", "block-helper", "blogger", "bluetooth", "bluetooth-audio", "bluetooth-connect", "bluetooth-off", "bluetooth-settings", "bluetooth-transfer", "blur", "blur-linear", "blur-off", "blur-radial", "bomb", "bomb-off", "bone", "book", "book-minus", "book-multiple", "book-multiple-variant", "book-open", "book-open-page-variant", "book-open-variant", "book-plus", "book-variant", "bookmark", "bookmark-check", "bookmark-music", "bookmark-outline", "bookmark-plus", "bookmark-plus-outline", "bookmark-remove", "boombox", "bootstrap", "border-all", "border-bottom", "border-color", "border-horizontal", "border-inside", "border-left", "border-none", "border-outside", "border-right", "border-style", "border-top", "border-vertical", "bow-tie", "bowl", "bowling", "box", "box-cutter", "box-shadow", "bridge", "briefcase", "briefcase-check", "briefcase-download", "briefcase-upload", "brightness-1", "brightness-2", "brightness-3", "brightness-4", "brightness-5", "brightness-6", "brightness-7", "brightness-auto", "broom", "brush", "buffer", "bug", "bulletin-board", "bullhorn", "bullseye", "burst-mode", "bus", "cached", "cake", "cake-layered", "cake-variant", "calculator", "calendar", "calendar-blank", "calendar-check", "calendar-clock", "calendar-multiple", "calendar-multiple-check", "calendar-plus", "calendar-question", "calendar-range", "calendar-remove", "calendar-text", "calendar-today", "call-made", "call-merge", "call-missed", "call-received", "call-split", "camcorder", "camcorder-box", "camcorder-box-off", "camcorder-off", "camera", "camera-burst", "camera-enhance", "camera-front", "camera-front-variant", "camera-iris", "camera-off", "camera-party-mode", "camera-rear", "camera-rear-variant", "camera-switch", "camera-timer", "cancel", "candle", "candycane", "car", "car-battery", "car-connected", "car-wash", "cards", "cards-outline", "cards-playing-outline", "cards-variant", "carrot", "cart", "cart-off", "cart-outline", "cart-plus", "case-sensitive-alt", "cash", "cash-100", "cash-multiple", "cash-usd", "cast", "cast-connected", "cast-off", "castle", "cat", "ceiling-light", "cellphone", "cellphone-android", "cellphone-basic", "cellphone-dock", "cellphone-iphone", "cellphone-link", "cellphone-link-off", "cellphone-settings", "certificate", "chair-school", "chart-arc", "chart-areaspline", "chart-bar", "chart-bar-stacked", "chart-bubble", "chart-gantt", "chart-histogram", "chart-line", "chart-line-stacked", "chart-pie", "chart-scatterplot-hexbin", "chart-timeline", "check", "check-all", "check-circle", "check-circle-outline", "checkbox-blank", "checkbox-blank-circle", "checkbox-blank-circle-outline", "checkbox-blank-outline", "checkbox-marked", "checkbox-marked-circle", "checkbox-marked-circle-outline", "checkbox-marked-outline", "checkbox-multiple-blank", "checkbox-multiple-blank-circle", "checkbox-multiple-blank-circle-outline", "checkbox-multiple-blank-outline", "checkbox-multiple-marked", "checkbox-multiple-marked-circle", "checkbox-multiple-marked-circle-outline", "checkbox-multiple-marked-outline", "checkerboard", "chemical-weapon", "chevron-double-down", "chevron-double-left", "chevron-double-right", "chevron-double-up", "chevron-down", "chevron-left", "chevron-right", "chevron-up", "chip", "church", "circle", "circle-outline", "cisco-webex", "city", "clipboard", "clipboard-account", "clipboard-alert", "clipboard-arrow-down", "clipboard-arrow-left", "clipboard-check", "clipboard-flow", "clipboard-outline", "clipboard-plus", "clipboard-text", "clippy", "clock", "clock-alert", "clock-end", "clock-fast", "clock-in", "clock-out", "clock-start", "close", "close-box", "close-box-outline", "close-circle", "close-circle-outline", "close-network", "close-octagon", "close-octagon-outline", "close-outline", "closed-caption", "cloud", "cloud-check", "cloud-circle", "cloud-download", "cloud-off-outline", "cloud-outline", "cloud-print", "cloud-print-outline", "cloud-sync", "cloud-upload", "code-array", "code-braces", "code-brackets", "code-equal", "code-greater-than", "code-greater-than-or-equal", "code-less-than", "code-less-than-or-equal", "code-not-equal", "code-not-equal-variant", "code-parentheses", "code-string", "code-tags", "code-tags-check", "codepen", "coffee", "coffee-outline", "coffee-to-go", "coin", "coins", "collage", "color-helper", "comment", "comment-account", "comment-account-outline", "comment-alert", "comment-alert-outline", "comment-check", "comment-check-outline", "comment-multiple-outline", "comment-outline", "comment-plus-outline", "comment-processing", "comment-processing-outline", "comment-question-outline", "comment-remove-outline", "comment-text", "comment-text-outline", "compare", "compass", "compass-outline", "console", "contact-mail", "contacts", "content-copy", "content-cut", "content-duplicate", "content-paste", "content-save", "content-save-all", "content-save-settings", "contrast", "contrast-box", "contrast-circle", "cookie", "copyright", "counter", "cow", "creation", "credit-card", "credit-card-multiple", "credit-card-off", "credit-card-plus", "credit-card-scan", "crop", "crop-free", "crop-landscape", "crop-portrait", "crop-rotate", "crop-square", "crosshairs", "crosshairs-gps", "crown", "cube", "cube-outline", "cube-send", "cube-unfolded", "cup", "cup-off", "cup-water", "currency-btc", "currency-eur", "currency-gbp", "currency-inr", "currency-ngn", "currency-rub", "currency-try", "currency-usd", "currency-usd-off", "cursor-default", "cursor-default-outline", "cursor-move", "cursor-pointer", "cursor-text", "database", "database-minus", "database-plus", "debug-step-into", "debug-step-out", "debug-step-over", "decagram", "decagram-outline", "decimal-decrease", "decimal-increase", "delete", "delete-circle", "delete-empty", "delete-forever", "delete-sweep", "delete-variant", "delta", "deskphone", "desktop-mac", "desktop-tower", "details", "developer-board", "deviantart", "dialpad", "diamond", "dice-1", "dice-2", "dice-3", "dice-4", "dice-5", "dice-6", "dice-d10", "dice-d20", "dice-d4", "dice-d6", "dice-d8", "dice-multiple", "dictionary", "directions", "directions-fork", "discord", "disk", "disk-alert", "disqus", "disqus-outline", "division", "division-box", "dna", "dns", "do-not-disturb", "do-not-disturb-off", "dolby", "domain", "dots-horizontal", "dots-vertical", "douban", "download", "download-network", "drag", "drag-horizontal", "drag-vertical", "drawing", "drawing-box", "dribbble", "dribbble-box", "drone", "dropbox", "drupal", "duck", "dumbbell", "earth", "earth-box", "earth-box-off", "earth-off", "edge", "eject", "elevation-decline", "elevation-rise", "elevator", "email", "email-alert", "email-open", "email-open-outline", "email-outline", "email-secure", "email-variant", "emby", "emoticon", "emoticon-cool", "emoticon-dead", "emoticon-devil", "emoticon-excited", "emoticon-happy", "emoticon-neutral", "emoticon-poop", "emoticon-sad", "emoticon-tongue", "engine", "engine-outline", "equal", "equal-box", "eraser", "eraser-variant", "escalator", "ethernet", "ethernet-cable", "ethernet-cable-off", "etsy", "ev-station", "evernote", "exclamation", "exit-to-app", "export", "eye", "eye-off", "eye-off-outline", "eye-outline", "eyedropper", "eyedropper-variant", "face", "face-profile", "facebook", "facebook-box", "facebook-messenger", "factory", "fan", "fast-forward", "fast-forward-outline", "fax", "feather", "ferry", "file", "file-account", "file-chart", "file-check", "file-cloud", "file-delimited", "file-document", "file-document-box", "file-excel", "file-excel-box", "file-export", "file-find", "file-hidden", "file-image", "file-import", "file-lock", "file-multiple", "file-music", "file-outline", "file-pdf", "file-pdf-box", "file-plus", "file-powerpoint", "file-powerpoint-box", "file-presentation-box", "file-restore", "file-send", "file-tree", "file-video", "file-word", "file-word-box", "file-xml", "film", "filmstrip", "filmstrip-off", "filter", "filter-outline", "filter-remove", "filter-remove-outline", "filter-variant", "find-replace", "fingerprint", "fire", "firefox", "fish", "flag", "flag-checkered", "flag-outline", "flag-outline-variant", "flag-triangle", "flag-variant", "flash", "flash-auto", "flash-off", "flash-outline", "flash-red-eye", "flashlight", "flashlight-off", "flask", "flask-empty", "flask-empty-outline", "flask-outline", "flattr", "flip-to-back", "flip-to-front", "floppy", "flower", "folder", "folder-account", "folder-download", "folder-google-drive", "folder-image", "folder-lock", "folder-lock-open", "folder-move", "folder-multiple", "folder-multiple-image", "folder-multiple-outline", "folder-open", "folder-outline", "folder-plus", "folder-remove", "folder-star", "folder-upload", "font-awesome", "food", "food-apple", "food-fork-drink", "food-off", "food-variant", "football", "football-australian", "football-helmet", "format-align-bottom", "format-align-center", "format-align-justify", "format-align-left", "format-align-middle", "format-align-right", "format-align-top", "format-annotation-plus", "format-bold", "format-clear", "format-color-fill", "format-color-text", "format-float-center", "format-float-left", "format-float-none", "format-float-right", "format-font", "format-header-1", "format-header-2", "format-header-3", "format-header-4", "format-header-5", "format-header-6", "format-header-decrease", "format-header-equal", "format-header-increase", "format-header-pound", "format-horizontal-align-center", "format-horizontal-align-left", "format-horizontal-align-right", "format-indent-decrease", "format-indent-increase", "format-italic", "format-line-spacing", "format-line-style", "format-line-weight", "format-list-bulleted", "format-list-bulleted-type", "format-list-checks", "format-list-numbers", "format-page-break", "format-paint", "format-paragraph", "format-pilcrow", "format-quote-close", "format-quote-open", "format-rotate-90", "format-section", "format-size", "format-strikethrough", "format-strikethrough-variant", "format-subscript", "format-superscript", "format-text", "format-textdirection-l-to-r", "format-textdirection-r-to-l", "format-title", "format-underline", "format-vertical-align-bottom", "format-vertical-align-center", "format-vertical-align-top", "format-wrap-inline", "format-wrap-square", "format-wrap-tight", "format-wrap-top-bottom", "forum", "forward", "foursquare", "fridge", "fridge-filled", "fridge-filled-bottom", "fridge-filled-top", "fullscreen", "fullscreen-exit", "function", "gamepad", "gamepad-variant", "garage", "garage-open", "gas-cylinder", "gas-station", "gate", "gauge", "gavel", "gender-female", "gender-male", "gender-male-female", "gender-transgender", "gesture-double-tap", "gesture-swipe-down", "gesture-swipe-left", "gesture-swipe-right", "gesture-swipe-up", "gesture-tap", "gesture-two-double-tap", "gesture-two-tap", "ghost", "gift", "git", "github-box", "github-circle", "github-face", "glass-flute", "glass-mug", "glass-stange", "glass-tulip", "glassdoor", "glasses", "gmail", "gnome", "gondola", "google", "google-cardboard", "google-chrome", "google-circles", "google-circles-communities", "google-circles-extended", "google-circles-group", "google-controller", "google-controller-off", "google-drive", "google-earth", "google-glass", "google-keep", "google-maps", "google-nearby", "google-pages", "google-photos", "google-physical-web", "google-play", "google-plus", "google-plus-box", "google-translate", "google-wallet", "gradient", "grease-pencil", "grid", "grid-large", "grid-off", "group", "guitar-acoustic", "guitar-electric", "guitar-pick", "guitar-pick-outline", "hackernews", "hamburger", "hand-pointing-right", "hanger", "hangouts", "harddisk", "headphones", "headphones-box", "headphones-settings", "headset", "headset-dock", "headset-off", "heart", "heart-box", "heart-box-outline", "heart-broken", "heart-half", "heart-half-full", "heart-half-outline", "heart-off", "heart-outline", "heart-pulse", "help", "help-box", "help-circle", "help-circle-outline", "help-network", "hexagon", "hexagon-multiple", "hexagon-outline", "highway", "history", "hololens", "home", "home-map-marker", "home-modern", "home-outline", "home-variant", "hook", "hook-off", "hops", "hospital", "hospital-building", "hospital-marker", "hotel", "houzz", "houzz-box", "human", "human-child", "human-female", "human-greeting", "human-handsdown", "human-handsup", "human-male", "human-male-female", "human-pregnant", "humble-bundle", "image", "image-album", "image-area", "image-area-close", "image-broken", "image-broken-variant", "image-filter", "image-filter-black-white", "image-filter-center-focus", "image-filter-center-focus-weak", "image-filter-drama", "image-filter-frames", "image-filter-hdr", "image-filter-none", "image-filter-tilt-shift", "image-filter-vintage", "image-multiple", "import", "inbox", "inbox-arrow-down", "inbox-arrow-up", "incognito", "infinity", "information", "information-outline", "information-variant", "instagram", "instapaper", "internet-explorer", "invert-colors", "itunes", "jeepney", "jira", "jsfiddle", "json", "keg", "kettle", "key", "key-change", "key-minus", "key-plus", "key-remove", "key-variant", "keyboard", "keyboard-backspace", "keyboard-caps", "keyboard-close", "keyboard-off", "keyboard-return", "keyboard-tab", "keyboard-variant", "kickstarter", "kodi", "label", "label-outline", "lambda", "lamp", "lan", "lan-connect", "lan-disconnect", "lan-pending", "language-c", "language-cpp", "language-csharp", "language-css3", "language-html5", "language-javascript", "language-php", "language-python", "language-python-text", "language-swift", "language-typescript", "laptop", "laptop-chromebook", "laptop-mac", "laptop-off", "laptop-windows", "lastfm", "launch", "layers", "layers-off", "lead-pencil", "leaf", "led-off", "led-on", "led-outline", "led-variant-off", "led-variant-on", "led-variant-outline", "library", "library-books", "library-music", "library-plus", "lightbulb", "lightbulb-on", "lightbulb-on-outline", "lightbulb-outline", "link", "link-off", "link-variant", "link-variant-off", "linkedin", "linkedin-box", "linux", "loading", "lock", "lock-open", "lock-open-outline", "lock-outline", "lock-pattern", "lock-plus", "lock-reset", "login", "login-variant", "logout", "logout-variant", "looks", "loop", "loupe", "lumx", "magnet", "magnet-on", "magnify", "magnify-minus", "magnify-minus-outline", "magnify-plus", "magnify-plus-outline", "mail-ru", "mailbox", "map", "map-marker", "map-marker-circle", "map-marker-minus", "map-marker-multiple", "map-marker-off", "map-marker-plus", "map-marker-radius", "margin", "markdown", "marker", "marker-check", "martini", "material-ui", "math-compass", "matrix", "maxcdn", "medical-bag", "medium", "memory", "menu", "menu-down", "menu-down-outline", "menu-left", "menu-right", "menu-up", "menu-up-outline", "message", "message-alert", "message-bulleted", "message-bulleted-off", "message-draw", "message-image", "message-outline", "message-plus", "message-processing", "message-reply", "message-reply-text", "message-settings", "message-settings-variant", "message-text", "message-text-outline", "message-video", "meteor", "microphone", "microphone-off", "microphone-outline", "microphone-settings", "microphone-variant", "microphone-variant-off", "microscope", "microsoft", "minecraft", "minus", "minus-box", "minus-box-outline", "minus-circle", "minus-circle-outline", "minus-network", "mixcloud", "monitor", "monitor-multiple", "more", "motorbike", "mouse", "mouse-off", "mouse-variant", "mouse-variant-off", "move-resize", "move-resize-variant", "movie", "multiplication", "multiplication-box", "music", "music-box", "music-box-outline", "music-circle", "music-note", "music-note-bluetooth", "music-note-bluetooth-off", "music-note-eighth", "music-note-half", "music-note-off", "music-note-quarter", "music-note-sixteenth", "music-note-whole", "music-off", "nature", "nature-people", "navigation", "near-me", "needle", "nest-protect", "nest-thermostat", "netflix", "network", "new-box", "newspaper", "nfc", "nfc-tap", "nfc-variant", "ninja", "nodejs", "note", "note-multiple", "note-multiple-outline", "note-outline", "note-plus", "note-plus-outline", "note-text", "notification-clear-all", "npm", "nuke", "numeric", "numeric-0-box", "numeric-0-box-multiple-outline", "numeric-0-box-outline", "numeric-1-box", "numeric-1-box-multiple-outline", "numeric-1-box-outline", "numeric-2-box", "numeric-2-box-multiple-outline", "numeric-2-box-outline", "numeric-3-box", "numeric-3-box-multiple-outline", "numeric-3-box-outline", "numeric-4-box", "numeric-4-box-multiple-outline", "numeric-4-box-outline", "numeric-5-box", "numeric-5-box-multiple-outline", "numeric-5-box-outline", "numeric-6-box", "numeric-6-box-multiple-outline", "numeric-6-box-outline", "numeric-7-box", "numeric-7-box-multiple-outline", "numeric-7-box-outline", "numeric-8-box", "numeric-8-box-multiple-outline", "numeric-8-box-outline", "numeric-9-box", "numeric-9-box-multiple-outline", "numeric-9-box-outline", "numeric-9-plus-box", "numeric-9-plus-box-multiple-outline", "numeric-9-plus-box-outline", "nut", "nutrition", "oar", "octagon", "octagon-outline", "octagram", "octagram-outline", "odnoklassniki", "office", "oil", "oil-temperature", "omega", "onedrive", "onenote", "opacity", "open-in-app", "open-in-new", "openid", "opera", "orbit", "ornament", "ornament-variant", "owl", "package", "package-down", "package-up", "package-variant", "package-variant-closed", "page-first", "page-last", "page-layout-body", "page-layout-footer", "page-layout-header", "page-layout-sidebar-left", "page-layout-sidebar-right", "palette", "palette-advanced", "panda", "pandora", "panorama", "panorama-fisheye", "panorama-horizontal", "panorama-vertical", "panorama-wide-angle", "paper-cut-vertical", "paperclip", "parking", "pause", "pause-circle", "pause-circle-outline", "pause-octagon", "pause-octagon-outline", "paw", "paw-off", "pen", "pencil", "pencil-box", "pencil-box-outline", "pencil-circle", "pencil-circle-outline", "pencil-lock", "pencil-off", "pentagon", "pentagon-outline", "percent", "periscope", "pharmacy", "phone", "phone-bluetooth", "phone-classic", "phone-forward", "phone-hangup", "phone-in-talk", "phone-incoming", "phone-locked", "phone-log", "phone-minus", "phone-missed", "phone-outgoing", "phone-paused", "phone-plus", "phone-settings", "phone-voip", "pi", "pi-box", "piano", "pig", "pill", "pillar", "pin", "pin-off", "pine-tree", "pine-tree-box", "pinterest", "pinterest-box", "pistol", "pizza", "plane-shield", "play", "play-box-outline", "play-circle", "play-circle-outline", "play-pause", "play-protected-content", "playlist-check", "playlist-minus", "playlist-play", "playlist-plus", "playlist-remove", "playstation", "plex", "plus", "plus-box", "plus-box-outline", "plus-circle", "plus-circle-multiple-outline", "plus-circle-outline", "plus-network", "plus-one", "plus-outline", "pocket", "pokeball", "polaroid", "poll", "poll-box", "polymer", "pool", "popcorn", "pot", "pot-mix", "pound", "pound-box", "power", "power-plug", "power-plug-off", "power-settings", "power-socket", "prescription", "presentation", "presentation-play", "printer", "printer-3d", "printer-alert", "printer-settings", "priority-high", "priority-low", "professional-hexagon", "projector", "projector-screen", "publish", "pulse", "puzzle", "qqchat", "qrcode", "qrcode-scan", "quadcopter", "quality-high", "quicktime", "radar", "radiator", "radio", "radio-handheld", "radio-tower", "radioactive", "radiobox-blank", "radiobox-marked", "raspberrypi", "ray-end", "ray-end-arrow", "ray-start", "ray-start-arrow", "ray-start-end", "ray-vertex", "rdio", "react", "read", "readability", "receipt", "record", "record-rec", "recycle", "reddit", "redo", "redo-variant", "refresh", "regex", "relative-scale", "reload", "remote", "rename-box", "reorder-horizontal", "reorder-vertical", "repeat", "repeat-off", "repeat-once", "replay", "reply", "reply-all", "reproduction", "resize-bottom-right", "responsive", "restart", "restore", "rewind", "rewind-outline", "rhombus", "rhombus-outline", "ribbon", "road", "road-variant", "robot", "rocket", "roomba", "rotate-3d", "rotate-left", "rotate-left-variant", "rotate-right", "rotate-right-variant", "rounded-corner", "router-wireless", "routes", "rowing", "rss", "rss-box", "ruler", "run", "run-fast", "sale", "satellite", "satellite-variant", "saxophone", "scale", "scale-balance", "scale-bathroom", "scanner", "school", "screen-rotation", "screen-rotation-lock", "screwdriver", "script", "sd", "seal", "search-web", "seat-flat", "seat-flat-angled", "seat-individual-suite", "seat-legroom-extra", "seat-legroom-normal", "seat-legroom-reduced", "seat-recline-extra", "seat-recline-normal", "security", "security-home", "security-network", "select", "select-all", "select-inverse", "select-off", "selection", "selection-off", "send", "serial-port", "server", "server-minus", "server-network", "server-network-off", "server-off", "server-plus", "server-remove", "server-security", "set-all", "set-center", "set-center-right", "set-left", "set-left-center", "set-left-right", "set-none", "set-right", "settings", "settings-box", "shape-circle-plus", "shape-plus", "shape-polygon-plus", "shape-rectangle-plus", "shape-square-plus", "share", "share-variant", "shield", "shield-half-full", "shield-outline", "shopping", "shopping-music", "shovel", "shovel-off", "shredder", "shuffle", "shuffle-disabled", "shuffle-variant", "sigma", "sigma-lower", "sign-caution", "sign-direction", "sign-text", "signal", "signal-2g", "signal-3g", "signal-4g", "signal-hspa", "signal-hspa-plus", "signal-off", "signal-variant", "silverware", "silverware-fork", "silverware-spoon", "silverware-variant", "sim", "sim-alert", "sim-off", "sitemap", "skip-backward", "skip-forward", "skip-next", "skip-next-circle", "skip-next-circle-outline", "skip-previous", "skip-previous-circle", "skip-previous-circle-outline", "skull", "skype", "skype-business", "slack", "sleep", "sleep-off", "smoking", "smoking-off", "snapchat", "snowflake", "snowman", "soccer", "sofa", "solid", "sort", "sort-alphabetical", "sort-ascending", "sort-descending", "sort-numeric", "sort-variant", "soundcloud", "source-branch", "source-commit", "source-commit-end", "source-commit-end-local", "source-commit-local", "source-commit-next-local", "source-commit-start", "source-commit-start-next-local", "source-fork", "source-merge", "source-pull", "speaker", "speaker-off", "speaker-wireless", "speedometer", "spellcheck", "spotify", "spotlight", "spotlight-beam", "spray", "square", "square-inc", "square-inc-cash", "square-outline", "square-root", "stackexchange", "stackoverflow", "stadium", "stairs", "star", "star-circle", "star-half", "star-off", "star-outline", "steam", "steering", "step-backward", "step-backward-2", "step-forward", "step-forward-2", "stethoscope", "sticker", "sticker-emoji", "stocking", "stop", "stop-circle", "stop-circle-outline", "store", "store-24-hour", "stove", "subdirectory-arrow-left", "subdirectory-arrow-right", "subway", "subway-variant", "summit", "sunglasses", "surround-sound", "svg", "swap-horizontal", "swap-vertical", "swim", "switch", "sword", "sword-cross", "sync", "sync-alert", "sync-off", "tab", "tab-plus", "tab-unselected", "table", "table-column-plus-after", "table-column-plus-before", "table-column-remove", "table-column-width", "table-edit", "table-large", "table-row-height", "table-row-plus-after", "table-row-plus-before", "table-row-remove", "tablet", "tablet-android", "tablet-ipad", "taco", "tag", "tag-faces", "tag-heart", "tag-multiple", "tag-outline", "tag-plus", "tag-remove", "tag-text-outline", "target", "taxi", "teamviewer", "telegram", "television", "television-guide", "temperature-celsius", "temperature-fahrenheit", "temperature-kelvin", "tennis", "tent", "terrain", "test-tube", "text-shadow", "text-to-speech", "text-to-speech-off", "textbox", "texture", "theater", "theme-light-dark", "thermometer", "thermometer-lines", "thumb-down", "thumb-down-outline", "thumb-up", "thumb-up-outline", "thumbs-up-down", "ticket", "ticket-account", "ticket-confirmation", "ticket-percent", "tie", "tilde", "timelapse", "timer", "timer-10", "timer-3", "timer-off", "timer-sand", "timer-sand-empty", "timer-sand-full", "timetable", "toggle-switch", "toggle-switch-off", "tooltip", "tooltip-edit", "tooltip-image", "tooltip-outline", "tooltip-outline-plus", "tooltip-text", "tooth", "tor", "tower-beach", "tower-fire", "traffic-light", "train", "tram", "transcribe", "transcribe-close", "transfer", "transit-transfer", "translate", "treasure-chest", "tree", "trello", "trending-down", "trending-neutral", "trending-up", "triangle", "triangle-outline", "trophy", "trophy-award", "trophy-outline", "trophy-variant", "trophy-variant-outline", "truck", "truck-delivery", "truck-fast", "truck-trailer", "tshirt-crew", "tshirt-v", "tumblr", "tumblr-reblog", "tune", "tune-vertical", "twitch", "twitter", "twitter-box", "twitter-circle", "twitter-retweet", "uber", "ubuntu", "umbraco", "umbrella", "umbrella-outline", "undo", "undo-variant", "unfold-less-horizontal", "unfold-less-vertical", "unfold-more-horizontal", "unfold-more-vertical", "ungroup", "unity", "untappd", "update", "upload", "upload-network", "usb", "vector-arrange-above", "vector-arrange-below", "vector-circle", "vector-circle-variant", "vector-combine", "vector-curve", "vector-difference", "vector-difference-ab", "vector-difference-ba", "vector-intersection", "vector-line", "vector-point", "vector-polygon", "vector-polyline", "vector-radius", "vector-rectangle", "vector-selection", "vector-square", "vector-triangle", "vector-union", "verified", "vibrate", "video", "video-off", "video-switch", "view-agenda", "view-array", "view-carousel", "view-column", "view-dashboard", "view-day", "view-grid", "view-headline", "view-list", "view-module", "view-parallel", "view-quilt", "view-sequential", "view-stream", "view-week", "vimeo", "vine", "violin", "visualstudio", "vk", "vk-box", "vk-circle", "vlc", "voice", "voicemail", "volume-high", "volume-low", "volume-medium", "volume-minus", "volume-mute", "volume-off", "volume-plus", "vpn", "walk", "wallet", "wallet-giftcard", "wallet-membership", "wallet-travel", "wan", "washing-machine", "watch", "watch-export", "watch-import", "watch-vibrate", "water", "water-off", "water-percent", "water-pump", "watermark", "waves", "weather-cloudy", "weather-fog", "weather-hail", "weather-lightning", "weather-lightning-rainy", "weather-night", "weather-partlycloudy", "weather-pouring", "weather-rainy", "weather-snowy", "weather-snowy-rainy", "weather-sunny", "weather-sunset", "weather-sunset-down", "weather-sunset-up", "weather-windy", "weather-windy-variant", "web", "webcam", "webhook", "webpack", "wechat", "weight", "weight-kilogram", "whatsapp", "wheelchair-accessibility", "white-balance-auto", "white-balance-incandescent", "white-balance-iridescent", "white-balance-sunny", "widgets", "wifi", "wifi-off", "wii", "wiiu", "wikipedia", "window-close", "window-closed", "window-maximize", "window-minimize", "window-open", "window-restore", "windows", "wordpress", "worker", "wrap", "wrench", "wunderlist", "xaml", "xbox", "xbox-controller", "xbox-controller-battery-alert", "xbox-controller-battery-empty", "xbox-controller-battery-full", "xbox-controller-battery-low", "xbox-controller-battery-medium", "xbox-controller-battery-unknown", "xbox-controller-off", "xda", "xing", "xing-box", "xing-circle", "xml", "yammer", "yeast", "yelp", "yin-yang", "youtube-play", "zip-box" };		
		
String app = request.getParameter("application");
String module = request.getParameter("module");
// We don't user <xava:link /> because of performance, 1ms each call for 1000 calls = 1 second, too much.		

      out.write("\r\n");
      out.write("<div class=\"");
      out.print(style.getIconsList());
      out.write("\">  \r\n");
 for (String icon: icons) { 
      out.write("\r\n");
      out.write("\t<i class=\"mdi mdi-");
      out.print(icon);
      out.write("\" title=\"");
      out.print(icon);
      out.write("\" onclick=\"openxava.executeAction('");
      out.print(app);
      out.write("', '");
      out.print(module);
      out.write("', '', false, 'Icon.choose', 'icon=");
      out.print(icon);
      out.write("')\"></i>\r\n");
 } 
      out.write("\r\n");
      out.write("</div>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
