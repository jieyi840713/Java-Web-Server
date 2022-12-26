# Java-Web-Server

## Intro to JDBC

Java資料庫連接，（Java Database Connectivity，簡稱JDBC）是Java語言中用來規範客戶端程式如何來存取資料庫的應用程式介面，提供了諸如查詢和更新資料庫中資料的方法。 

我們為什麼需要資料庫？ 我們不能只將所有數據存儲在 Excel 表格中嗎？ 儘管可以對電子表格中的數據進行排序和過濾，但資料庫具有廣泛的查詢功能，可以檢索與選擇條件匹配的所有記錄、多個表中的交叉引用記錄以及跨多個表執行複雜的聚合計算。此外，就查詢資料而言，資料庫比 Excel 快上許多，在資料龐大時差別會更明顯。 此外，Excel 可以處理最多大約 100 萬行數據，但對於現代資料來說明顯容量不足了。

有兩種類型的資料庫 - relational和non-relational。Relational Database是一種存儲並提供對彼此相關的數據點的訪問的資料庫。例如，一家娛樂公司有一個資料庫來存儲他們所有的藝術家和歌曲數據。 所有歌曲都有一位或多於一位作家，所有作家都有一首或多於一首歌曲。 因此，該數據庫的每個表格之間是有關連的。

JDBC API 是一組 Java interfaces和classes，用於編寫用於訪問和操作關係數據庫的 Java 程序。 由於 JDBC 驅動程式(Database driver) 用於 JDBC 和專有數據庫之間通信的接口，因此 JDBC 驅動程序是特定於數據庫的，通常由數據庫供應商提供。

## Intro to HTTP

HTTP 代表超文本傳輸協議(Hypertext Transfer Protocols) 。

HTTP 是 Web 上任何數據交換的基礎。 理解 HTTP 的一個簡單方法是將 HTTP 視為全世界的一項協議，規定應如何在網路上傳輸數據與各種文件。

HTTPS 中的字母 s 代表secure。 所有傳輸的數據均採用RSA算法加密。當我們訪問網址 https://www.youtube.com 時，我們會向 YouTube 的伺服器發送一個 HTTP request。

YouTube 的伺服器收到我們的 HTTP request，它會發送一個 HTTP response，其中包括 HTML code。 我們的瀏覽器接收 HTTP response，解析來自 YouTube 的 HTML 代碼，並將網頁顯示在我們的屏幕上。

## First Servlet Program

我們可以用Java來寫網頁伺服器的腳本。 HTTPServlet是在Java當中的特殊class，功能為接收與回應特定的HTTP request。 Servlet必須在 servlet 容器中運行，而最著名的開源 servlet 容器之一是Tomcat和 Glassfish。

此外，現在市面上有各種在 Servlet 之上運行的框架技術，例如 Struts, SpringMVC等等 。

### JSP

JSP（全稱Jakarta Server Pages，曾稱為JavaServer Pages）是由Sun Microsystems公司主導建立的一種動態網頁技術標準。JSP部署於網路伺服器上，可以回應客戶端傳送的請求，並根據請求內容動態地生成HTML、XML或其他格式文件的Web網頁，然後返回給請求者。

JSP技術以Java語言作為手稿語言，為使用者的HTTP請求提供服務，並能與伺服器上的其它Java程式共同處理複雜的業務需求。

常見語法規則：

1. Expression - <%= java expression %>
2. scriptlet - <% java statement %>
3. declaration - <%! java method or field declaration %>
4. JSP Comments - <%-- comment goes here --%>

### JSP 中的預定義變量(Predefined Variables)

幾個常用的predefined variables包含：

1. request – HttpServlet Request的instance，可用來獲得 cookies 或是 request parameters。
2. Response – HttpServlet Response的instance，可用來設定給response的HTTP status code。

## Directive

我們可以使用 JSP directive來指示 JSP 引擎如何處理 JSP 代碼。 可使用的directive包括：

1. page - 允許為頁面提供信息，例如導入Class，或是設定頁面的content type。 page directive可以出現在 JSP 文件中的任何位置。
2. include - 允許在JSP頁面插入其他文件。include 指令必須放在想要插入文件的位置。
3. taglib - 讓您定義自定義標籤。

## JavaBeans

如果一個Class具有以下 3 個特性，那麼它就是一個 JavBeans Class(這是一種標準)：

1. All properties are private。
2. 這個class有一個 public constructor with no arguments。
3. Implements Serializable interface（這個要求在 JSP 中不是必須的）

我們可以在JSP當中instantiate JavaBeans Objects，且設定以下的四種scope: application, session, page, request。
