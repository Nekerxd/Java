<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<jsp:include page="/header.jsp"/>
<jsp:include page="/menu.jsp"/>

<!--Page Heading-->
    <div class="row">
        <div class="col-12">
            <div class="page-title-box">
                <h4 class="page-title float-left">Bancos</h4>

                <ol class="breadcrumb float-right">
                    <li class="breadcrumb-item">
                        <a href="${pageContext.request.contextPath}/">Home</a>
                    </li>
                    <li class="breadcrumb-item">
                        <a href="#">Cadastros</a>
                    </li>
                    <li class="breadcrumb-item">
                        <a href="${pageContext.request.contextPath}/BancoListar">Banco</a></li>
                    <li class="breadcrumb-item active">Cadastro</li>
                </ol>

                <div class="clearfix"></div>
            </div>
        </div>
    </div>


    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Cadastro</h6>
        </div>

        <div class="card-body">
            <form name="cadastrarbanco" action="BancoCadastrar" method="POST">
                <div class="form-row">
                    
                    <input type="hidden" class="form-control" name="idbanco" id="idbanco" 
                           required value="${banco.idBanco}" style="text-transform: uppercase"/>

                    <div class="form-group col-md-8">
                        <label for="nomebanco" class="col-form-label">Nome:</label>
                        <input type="text" class="form-control descricao" name="nomebanco" id="nomebanco" 
                               required value="${banco.nomeBanco}" style="text-transform: uppercase"/>
                    </div>
                </div>
                <div class="form-group">        
                    <button type="submit" class="btn btn-success navbar-btn" id="submit"><i class="fa fa-floppy-o" aria-hidden="true"></i> Salvar </button>
                    <button type="reset" class="btn btn-danger navbar-btn" id="reset"><i class="fa fa-floppy-o" aria-hidden="true"></i> Limpar</button>
                    <button class="btn btn-warning navbar-btn">
                        <a href="${pageContext.request.contextPath}/BancoListar" class="btn-warning" style="text-decoration: none">Cancelar</a>
                    </button> 
                </div>
            </form>
        </div>
    </div>

<%@include file="/footer.jsp" %>