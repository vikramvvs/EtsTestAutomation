package com.test;

import com.test.pages.EtsyPlatformPage;
import com.test.pages.Navigate;

public class ObjectRepository {

    private Navigate navigate;
    private EtsyPlatformPage etsyPlatformPage;
    public ObjectRepository() {
        //Empty constructor
    }

    protected Navigate navigate() {

        if (navigate == null) {
            navigate = new Navigate();
        }
        return navigate;
    }

    protected EtsyPlatformPage etsyPlatformPage() {
        if(etsyPlatformPage == null) {
            etsyPlatformPage = new EtsyPlatformPage();
        }
        return etsyPlatformPage;
    }
}
