function getDetailCategory(id){

    $.ajax({
        type:"GET",
        url:"/detailCategory/" + id,
        success:function (result){
            var content ="";
            $.each(result,function (key,val){
                content +=`<div class="col-lg-4 col-md-4 col-12 ">
                            <article className="single_product">
                                <figure>
                                    <div className="product_thumb">
                                        <a className="primary_img" href="/detailProduct/`+val.id+`"><img
                                            src="/images/`+val.photo +`" alt=""></a>
                                        <div className="label_product">
                                            <span className="label_sale">sale</span>
                                        </div>
                                        <div className="add_to_cart">
                                            <a href="cart.html" title="add to cart">Add to cart</a>
                                        </div>
                                    </div>
                                    <figcaption className="product_content">
                                        <div className="price_box">
                                            <span className="current_price">`+val.price+`</span>
                            
                                        </div>
                                        <h3 className="product_name"><a href="/detailProduct/`+val.id+`">`+val.name+`</a></h3>
                                    </figcaption>
                                </figure>
                            </article>
                            </div>
                            `
            });
            $('#listProduct').html(content);
        }
        })
}

function sortAscByPrice(){
    $.ajax({
        type:"GET",
        url:"/sortProductAsc",
        success:function (result){
            var content ="";
            $.each(result,function (key,val){
                content +=`<div class="col-lg-4 col-md-4 col-12 ">
                            <article className="single_product">
                                <figure>
                                    <div className="product_thumb">
                                        <a className="primary_img" href="/detailProduct/`+val.id+`"><img
                                            src="/images/`+val.photo +`" alt=""></a>
                                        <div className="label_product">
                                            <span className="label_sale">sale</span>
                                        </div>
                                        <div className="add_to_cart">
                                            <a href="cart.html" title="add to cart">Add to cart</a>
                                        </div>
                                    </div>
                                    <figcaption className="product_content">
                                        <div className="price_box">
                                            <span className="current_price">`+val.price+`</span>

                                        </div>
                                        <h3 className="product_name"><a href="/detailProduct/`+val.id+`">`+val.name+`</a></h3>
                                    </figcaption>
                                </figure>
                            </article>
                            </div>
                            `
            });
            $('#listProduct').html(content);
        }
    })
}


function sortDescByPrice(){
    $.ajax({
        type:"GET",
        url:"/sortProductDesc",
        success:function (result){
            var content ="";
            $.each(result,function (key,val){
                content +=`<div class="col-lg-4 col-md-4 col-12 ">
                            <article className="single_product">
                                <figure>
                                    <div className="product_thumb">
                                        <a className="primary_img" href="/detailProduct/`+val.id+`"><img
                                            src="/images/`+val.photo +`" alt=""></a>
                                        <div className="label_product">
                                            <span className="label_sale">sale</span>
                                        </div>
                                        <div className="add_to_cart">
                                            <a href="cart.html" title="add to cart">Add to cart</a>
                                        </div>
                                    </div>
                                    <figcaption className="product_content">
                                        <div className="price_box">
                                            <span className="current_price">`+val.price+`</span>

                                        </div>
                                        <h3 className="product_name"><a href="/detailProduct/`+val.id+`">`+val.name+`</a></h3>
                                    </figcaption>
                                </figure>
                            </article>
                            </div>
                            `
            });
            $('#listProduct').html(content);
        }
    })
}

function filterByPrice(){
    var x = document.getElementById("amount").value;
    var myarray = x.split(' ');
    var from = myarray[0].split('$')[1]*1e5;
    var to = myarray[2].split('$')[1]*1e5;

    console.log(from,to);
    $.ajax({
        type:"GET",
        url:'/filterByPrice/' + from + '/' + to,
        success:function (result){
            var content ="";
            $.each(result,function (key,val){
                content +=`<div class="col-lg-4 col-md-4 col-12 ">
                            <article className="single_product">
                                <figure>
                                    <div className="product_thumb">
                                        <a className="primary_img" href="/detailProduct/`+val.id+`"><img
                                            src="/images/`+val.photo +`" alt=""></a>
                                        <div className="label_product">
                                            <span className="label_sale">sale</span>
                                        </div>
                                        <div className="add_to_cart">
                                            <a href="cart.html" title="add to cart">Add to cart</a>
                                        </div>
                                    </div>
                                    <figcaption className="product_content">
                                        <div className="price_box">
                                            <span className="current_price">`+val.price+`</span>

                                        </div>
                                        <h3 className="product_name"><a href="/detailProduct/`+val.id+`">`+val.name+`</a></h3>
                                    </figcaption>
                                </figure>
                            </article>
                            </div>
                            `
            });
            $('#listProduct').html(content);
        }
    })
}



function pagingProduct(pageNo){
    $.ajax({
        type:"GET",
        url:'/pagingProduct/' + pageNo,
        success:function (result){
            var content ="";
            $.each(result,function (key,val){
                content +=`<div class="col-lg-4 col-md-4 col-12 ">
                            <article className="single_product">
                                <figure>
                                    <div className="product_thumb">
                                        <a className="primary_img" href="/detailProduct/`+val.id+`"><img
                                            src="/images/`+val.photo +`" alt=""></a>
                                        <div className="label_product">
                                            <span className="label_sale">sale</span>
                                        </div>
                                        <div className="add_to_cart">
                                            <a href="cart.html" title="add to cart">Add to cart</a>
                                        </div>
                                    </div>
                                    <figcaption className="product_content">
                                        <div className="price_box">
                                            <span className="current_price">`+val.price+`</span>

                                        </div>
                                        <h3 className="product_name"><a href="/detailProduct/`+val.id+`">`+val.name+`</a></h3>
                                    </figcaption>
                                </figure>
                            </article>
                            </div>
                            `
            });
            $('#listProduct').html(content);
        }
    })
}

