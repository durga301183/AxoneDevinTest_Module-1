public class Arrays {

    public static void main(String[] args) {
            String[] strArr = new String[4];
            int[] numbers = {0,1,2,3,4,5};

            String[] herbs = {"Thyme","Rosemary","Coriander"};

            //traditional for loop. once initialised cannot modify though can change the data in the index
        //cannot increase or decrease the size of the array. when creating need to know the size or should sacrifixce oth ememory
            for (int i = 0; i < herbs.length; i++) {
                System.out.println(herbs[i]);
                if (i == 1) {
                    herbs[i] = "Basil";
                }
                System.out.println(herbs[i]);
            }

            //for each loop- enhanced loop used for collections
            for (String herb : herbs) //herbs of type string in a collection of herbs
                //cannot modify the array which is the limitation for 'for each' loop
            {
                System.out.println(herb);//not using the index and idrectly using th eobject itself

                if (herb.equalsIgnoreCase("Coriander")){
                    System.out.println("This is coriander");
                }
            }

//in collections we can dynamically resize the data
        }
    }





