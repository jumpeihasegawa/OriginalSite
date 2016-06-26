<%-- 
    Document   : top
    Created on : 2016/06/21, 13:20:48
    Author     : Jumpei
--%>

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

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>

        <script type="text/javascript">
            $('.bs-component [data-toggle="popover"]').popover();
            $('.bs-component [data-toggle="tooltip"]').tooltip();
        </script>

        <header>
            <div class="navbar navbar-default navbar-fixed-top">
                <div class="container">
                    <div class="navbar-header">
                        <a href="top.jsp" class="navbar-brand">News巻物</a>
                        <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-main">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                    <div class="navbar-collapse collapse" id="navbar-main">
                        <ul class="nav navbar-nav">
                            <li><a href="top.jsp">Top</a></li>
                        </ul>
                        <form class="navbar-form navbar-left" action="Login" method="POST" onsubmit="<%%>;
                return false">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="UserName">
                                <input type="text" class="form-control" placeholder="Password">
                            </div>
                            <button type="submit" class="btn btn-default">Login</button>
                        </form>
                    </div>
                </div>
        </header>

        <div class="page-header">
            <div class="container">        
                <div class="row">
                    <div class="col-lg-12">
                        <div class="bs-component">
                            <div class="jumbotron">
                                <h1>News巻物</h1>
                                <p>下のボタンから読みたいニュースのジャンルを選んでください</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="container">
            <div class="row" >
                <div class="col-lg-2">
                    <p class="bs-component">
                        <a href="Genre?genre=national" class="btn btn-primary btn-lg btn-block">国内</a>
                    </p>
                </div>
                <div class="col-lg-2">
                    <p class="bs-component">
                        <a href="Genre?genre=world" class="btn btn-primary btn-lg btn-block">海外</a>
                    </p>
                </div>
                <div class="col-lg-2">
                    <p class="bs-component">
                        <a href="Genre?genre=money" class="btn btn-primary btn-lg btn-block">ビジネス</a>
                    </p>
                </div>
                <div class="col-lg-2">
                    <p class="bs-component">
                        <a href="Genre?genre=techandscience" class="btn btn-primary btn-lg btn-block">テクノロジー</a>
                    </p>
                </div>
                <div class="col-lg-2">
                    <p class="bs-component">
                        <a href="Genre?genre=entertainment" class="btn btn-primary btn-lg btn-block">エンタメ</a>
                    </p>
                </div>
                <div class="col-lg-2">
                    <p class="bs-component">
                        <a href="Genre?genre=sports" class="btn btn-primary btn-lg btn-block">スポーツ</a>
                    </p>
                </div>
            </div>
        </div>

    </body>
</html>
