import java.util.Scanner;
public class DecisionGameHw {
// Brandon Cooper
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // Game introduction and your first choices 
		 Scanner key = new Scanner(System.in);
	        System.out.println("Welcome to Escape The Island !!");
	        System.out.println("You wake up stranded on a creepy island after a shipwreck. You need to find a way off.\nYour decision will determine if you escape, live, or DIE!");
	        System.out.println("Do you want to go to the 'cave' , 'forest' , or 'shore'?");
	        String choice = key.nextLine();
	        
	        //player stats 
	        int health = 100;
	        boolean hasMap = false; // gave both boolean values default values so i could maniuplate them later in the if statements 
	        boolean hasSupplies = false;
               
	        
	        // path for the cave 
	        if(choice.equalsIgnoreCase("cave")) {
	            System.out.println("You choose the cave , and you see a treasure chest.\nDo you want to take the 'treasure' or go down the 'tunnel' ");
	            String caveChoice= key.nextLine();

	            if (caveChoice.equalsIgnoreCase("treasure")) {
	                System.out.println("You get the treasure, but the cave collapses in on you and now you're trapped forever!!");
	            }
	            else if(caveChoice.equalsIgnoreCase("tunnel")) {
	                System.out.println("You see something on the ground do you 'take' it or 'ignore' it");
	                String tunnelChoice= key.nextLine();
	                if(tunnelChoice.equalsIgnoreCase("take")) {           
	                    System.out.println("It was a map! Now you can either go to the 'shore' or the 'forest'");  // here you get the map from the cave this map can be used later on for one of the other routes 
	                    hasMap = true;
	                    String mapChoice = key.nextLine();

	                    if(mapChoice.equalsIgnoreCase("forest")) {
	                        //this is the path for the forest if you go to the cave first 
	                        System.out.println("You choose the forest, do you want to 'follow path' , 'eat the forest berries' , or 'gather wood' ");
	                        String forestChoice = key.nextLine();

	                        if(forestChoice.equalsIgnoreCase("follow path")) {
	                            System.out.println("You found a village and the people there helped you escape \nYOU WIN!");
	                        }
	                        else if(forestChoice.equalsIgnoreCase("eat the forest berries")) {
	                            System.out.println("They were poisonous and you DIE!");
	                        }
	                        else {
	                            System.out.println("You gather wood and get more supplies. Now will you 'follow path' or go to the 'shore'?"); // the supplies gathering is also important for something later 
	                            hasSupplies = true;
	                            String woodChoice = key.nextLine();

	                            if(woodChoice.equalsIgnoreCase("shore")) {
	                                // shore story if you go from cave to forest to shore 
	                                System.out.println("You choose to go to the shore. Do you want to 'build raft' , 'swim' , or 'shoot a flare'?");
	                                String shoreChoice = key.nextLine();

	                                if(shoreChoice.equalsIgnoreCase("build raft")){  // You will need to get the map and the wood from the forest for the raft to be built at the shore to be sucessful 
	                                    if(hasMap && hasSupplies) {
	                                        System.out.println("You successfully build the raft and escape! \nYOU WIN!");
	                                    } else {
	                                        System.out.println("Your raft falls apart and you drown!");
	                                    }
	                                }
	                                else if(shoreChoice.equalsIgnoreCase("swim")) {
	                                    System.out.println("You attempt to swim and get eaten by a shark!!");
	                                }
	                                else {
	                                    System.out.println("You shoot the flare and are rescued \nYOU WIN!");
	                                }
	                            }
	                        }
	                    } else if(mapChoice.equalsIgnoreCase("shore")) {
	                        // This is if you decide to go the shore after the cave
	                        System.out.println("You choose to go to the shore. Do you want to 'build raft' , 'swim' , or 'shoot a flare'?");
	                        String shoreChoice = key.nextLine();

	                        if(shoreChoice.equalsIgnoreCase("build raft")){
	                            if(hasMap && hasSupplies) {
	                                System.out.println("You successfully build the raft and escape! \nYOU WIN!");
	                            } else {
	                                System.out.println("Your raft falls apart and you drown!");
	                            }
	                        }
	                        else if(shoreChoice.equalsIgnoreCase("swim")) {
	                            System.out.println("You attempt to swim and get eaten by a shark!!");
	                        }
	                        else {
	                            System.out.println("You shoot the flare and are rescued \nYOU WIN!");
	                        }
	                    }
	                } else {
	                    if(health > 50) {
	                        System.out.println("You find a monster, bravely fight it, but die.");
	                    } else {
	                        System.out.println("You find a monster and it devours you.");
	                    }
	                }
	            }
	        }

	        // Code for when you start at the forest
	        if(choice.equalsIgnoreCase("forest")) {
	            System.out.println("You choose the forest, do you want to 'follow path' , 'eat the forest berries' , or 'gather wood' ");
	            String forestChoice = key.nextLine();

	            if(forestChoice.equalsIgnoreCase("follow path")) {
	                System.out.println("You found a village and the people there helped you escape \nYOU WIN!");
	            }
	            else if(forestChoice.equalsIgnoreCase("eat the forest berries")) {
	                System.out.println("They were poisonous and you DIE!");
	            }
	            else {
	                System.out.println("You gather wood and get more supplies. Now will you 'follow path' or go to the 'shore'?");
	                hasSupplies = true;
	                String woodChoice = key.nextLine();

	                if(woodChoice.equalsIgnoreCase("shore")) {
	                    // code for going to the shore after the forest 
	                    System.out.println("You choose to go to the shore. Do you want to 'build raft' , 'swim' , or 'shoot a flare'?");
	                    String shoreChoice = key.nextLine();

	                    if(shoreChoice.equalsIgnoreCase("build raft")){
	                        if(hasMap && hasSupplies) {
	                            System.out.println("You successfully build the raft and escape! \nYOU WIN!");
	                        } else {
	                            System.out.println("Your raft falls apart and you drown!");
	                        }
	                    }
	                    else if(shoreChoice.equalsIgnoreCase("swim")) {
	                        System.out.println("You attempt to swim and get eaten by a shark!!");
	                    }
	                    else {
	                        System.out.println("You shoot the flare and are rescued \nYOU WIN!");
	                    }
	                }
	            }
	        }

	        // Code for starting at the shore 
	        if(choice.equalsIgnoreCase("shore")) {
	            System.out.println("You choose to go to the shore. Do you want to 'build raft' , 'swim' , or 'shoot a flare'?");
	            String shoreChoice = key.nextLine();

	            if(shoreChoice.equalsIgnoreCase("build raft")){
	                if(hasMap && hasSupplies) {
	                    System.out.println("You successfully build the raft and escape! \nYOU WIN!");  // you start at the shore raft will not work because you do not have the map or supplies from the other two locations 
	                } else {
	                    System.out.println("Your raft falls apart and you drown!");
	                }
	            }
	            else if(shoreChoice.equalsIgnoreCase("swim")) {
	                System.out.println("You attempt to swim and get eaten by a shark!!");
	            }
	            else {
	                System.out.println("You shoot the flare and are rescued \nYOU WIN!");
	            }
	        }
	    }
	}
