package HomeWork3LayerApp.Entities;


    public class Category {

        private int id;
        private String name;

        public Category(int id,String name) { // parametrized Constructor
            this.name = name;
            this.id = id;
        }


        public int getId() {
            return id;
        }

        public void setId(int myid) {
            if (myid<0){
                myid = 0;
            }
            this.id = myid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

