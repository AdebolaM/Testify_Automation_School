package com.accessone;

import com.accesstwo.AccessTwoClass;

public class AccesOneclass {
public static void main(String[] args) {
    AccessTwoClass access =new AccessTwoClass();

        access.accessMethod();
    AccesOneclass Secondaccess =new AccesOneclass();
    Secondaccess.accessMethodPrivate();
}


private void accessMethodPrivate(){
    System.out.println("This is a  private method");
}
}
