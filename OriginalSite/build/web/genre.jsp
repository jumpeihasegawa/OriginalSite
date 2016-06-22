<%-- 
    Document   : genre
    Created on : 2016/06/16, 17:11:10
    Author     : Jumpei
--%>

<%@page import="MSN.Helper"%>
<%@page import="java.util.ArrayList"%>
<%@page import="MSN.MSNBeans"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<MSNBeans> mbArr = (ArrayList<MSNBeans>) session.getAttribute("newsArr");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>News巻物</title>

        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <style type="text/css">
            body { padding-top: 80px; }
            @media ( min-width: 768px ) {
                #banner {
                    min-height: 300px;
                    border-bottom: none;
                }
                .bs-docs-section {
                    margin-top: 8em;
                }
                .bs-component {
                    position: relative;
                }
                .bs-component .modal {
                    position: relative;
                    top: auto;
                    right: auto;
                    left: auto;
                    bottom: auto;
                    z-index: 1;
                    display: block;
                }
                .bs-component .modal-dialog {
                    width: 90%;
                }
                .bs-component .popover {
                    position: relative;
                    display: inline-block;
                    width: 220px;
                    margin: 20px;
                }
                .nav-tabs {
                    margin-bottom: 15px;
                }
                .progress {
                    margin-bottom: 10px;
                }
            }
        </style>

        <!--[if lt IE 9]>
          <script src="//oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="//oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->


    </head>
    <body>
        <header>
            <div class="navbar navbar-default navbar-fixed-top">
                <div class="container">
                    <div class="navbar-header">
                        <a href="/OriginalSite/bootstrap/umi/top.jsp" class="navbar-brand">News巻物</a>
                        <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-main">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                    <div class="navbar-collapse collapse" id="navbar-main">
                        <ul class="nav navbar-nav">
                            <li><a href="/OriginalSite/bootstrap/umi/top.jsp">Top</a></li>
                            <li><a href="//github.com/NKMR6194/Umi/releases">Login</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </header>

        <div class="container">

            <div class="page-header" >
                <h1><%=Helper.getInstance().genre(mbArr.get(0).getGenre())%></h1>
            </div>
        </div>

        <%for (int i = 0; i < mbArr.size(); i++) {%>
        <div class="container" >
            <div class="row" >
                <div class="col-lg-9">
                    <div class="bs-component">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <h3 class="panel-title" ><%=mbArr.get(i).getTitel()%></h3>
                            </div>
                            <div class="panel-body">
                                <%=mbArr.get(i).getText()%>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3">
                    <div class="col-xs-6">
                        <%for (int n = 0; n < mbArr.get(i).getDataSrcArr().size(); n++) {%>
                        <img alt="" class="img-rounded" src="<%=mbArr.get(i).getImage(n)%>">
                        <% }%>
                    </div>
                </div>
            </div> 
        </div>                       
    </body>
</html>

