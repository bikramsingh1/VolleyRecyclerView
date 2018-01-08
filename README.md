# VolleyRecyclerView
How you can Insert and Fetch the data from server using Volley and RecyclerView?

**Introduction to volley**
Volley is a networking library it offers great features like synchronous requests, asynchronous requests, prioritization, making multiple requests at the same time, ordered requests and of course caching.

1.	No automatic parsing
2.	Caching Mechanism
3.	Retry policy
4.	inbuilt image loading support

Android volley has a very elaborate and flexible **caching mechanism**.When a request is made through volley first the cache is checked for appropriate response if it is found there than it is returned and parsed else network hit is made.


Volley supports both post requests and multipart uploads but for post requests we have to convert our java objects to JSONObject.Also for multipart uploads we have to do some extra code and use some additional classes.


Volley we can set a retry policy using set**RetryPolicy** method. It support the customized request timeout, number of retries and back off multiplier.

**Volley can capture four types of responses automatically through these requests:**


**StringRequest –** This type of request converts the response into a String.

**JsonObjectRequest –** This type of request and response is automatically converted into a JSONObject.

**JsonArrayRequest –** This type of request and response is automatically converted into a JSONArray.

**ImageRequest –** This type of request converts the response into a decoded bitmap.

**_Must add these dependencies in build.gradle(Module app)_**

    implementation 'com.android.support:cardview-v7:26.1.0'       
    implementation 'com.android.support:recyclerview-v7:26.1.0'       
    implementation 'com.android.support:design:26.1.0'        
    compile 'com.mcxiaoke.volley:library:1.0.19'

