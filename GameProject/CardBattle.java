/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GameProject;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author Nanda D. Cahyo
 */
public class CardBattle {
    /**
     * Fungsi untuk menampilkan cara bermain
     */
    public static void aboutGame() {
        System.out.println("Penjelasan game:");
        System.out.println("1. Card Battle Game adalah permainan kartu yang dimainkan oleh 2 orang");
        System.out.println("2. Setiap player memilki 10 kesempatan untuk draw kartu, dan hanya dapat menyimpan maksimal 5 kartu");
        System.out.println("3. Draw kartu dilakukan player untuk mengambil kartu secara acak untuk disimpan oleh player");
        System.out.println("4. Player dapat menyimpan atau membuang kartu yang telah di draw");
        System.out.println("5. Ketika player memilih untuk menyimpan kartu maka kartu akan disimpan ke \"Player Hand\"");
        System.out.println("6. Ketika kedua player sudah mengambil masing-masing 5 kartu mereka, maka saatnya Card Battle dimulai");
        System.out.println("7. Card battle dilakukan dengan membandingkan kedua kartu teratas player, manakah yang lebih besar.");
        System.out.println("8. Ketika salah satu player memiliki kartu yang lebih tinggi maka akan mendapatkan +1 skor");
        System.out.println("9. Dan jika kondisi draw maka masing-masing player akan mendapatkan skor +1");
        System.out.println("10. Dari skor tersebut, pemilik skor tertinggi lah yang menjadi pemenang");
        System.out.println("");
    }
    
    /**
     * Fungsi untuk mengatur permainan dari player 1
     * @param scan
     * @param rng
     * @param p1_hand 
     */
    public static void P1Play(Scanner scan, Random rng, ArrayBlockingQueue p1_hand) {
        boolean p1_play = true;
        int p1_menus, store_card_confirm, card_draw, p1_draw_chance = 10;
        
        while (p1_play) {
            System.out.println("Player 1 bermain");
            System.out.println("Sisa draw kartu : " + p1_draw_chance + " | Kartu yang disimpan : " + p1_hand.size());
            System.out.println("Menu: ");
            System.out.println("1. Draw kartu");
            System.out.println("2. Lihat kartu yang disimpan");
            System.out.println("3. Akhiri giliran");
            System.out.print("Pilihan anda : ");
            p1_menus = scan.nextInt();
            System.out.println("");
            
            switch (p1_menus) {
                case 1 :
                    if (p1_draw_chance == 0 || p1_hand.size() == 5) {
                        System.out.println("Tidak dapat melakukan draw kartu, karena kartu sudah penuh atau sisa draw habis.");
                        System.out.println("");
                    } else {
                        p1_draw_chance--;
                        card_draw = rng.nextInt(12);
                        
                        System.out.println("Kamu menemukan kartu : " + card_draw);
                        System.out.println("1. Simpan kartu");
                        System.out.println("2. Buang kartu");
                        System.out.print("Pilihan kamu : ");
                        store_card_confirm = scan.nextInt();
                        System.out.println("");
                        
                        switch (store_card_confirm) {
                            case 1:
                                System.out.println("Kartu " + card_draw + " disimpan");
                                p1_hand.offer(card_draw);
                                System.out.println("");
                                break;
                            case 2:
                                System.out.println("Kartu " + card_draw + " dibuang");
                                System.out.println("");
                                break;
                            default:
                                System.out.println("Pilihan anda tidak ada dalam menu");
                                break;
                        }
                    }
                    break;
                case 2 :
                    cardInHand(p1_hand);
                    break;
                case 3 :
                    System.out.println("P1 telah selesai.");
                    System.out.println("");
                    
                    if (p1_hand.size() != 5) {
                        p1_hand.offer(0);
                        p1_hand.offer(0);
                        p1_hand.offer(0);
                        p1_hand.offer(0);
                    }
                    
                    p1_play = false;
                    break;
                default :
                    System.out.println("Pilihan anda tidak ada dalam menu");
                    break;
            }
        }
    }
    
    /**
     * Fungsi untuk mengatur permainan dari player 2
     * @param scan
     * @param rng
     * @param p2_hand 
     */
    public static void P2Play(Scanner scan, Random rng, ArrayBlockingQueue p2_hand) {
        boolean p2_play = true;
        int p2_menus, store_card_confirm, card_draw, p2_draw_chance = 10;
        
        while (p2_play) {
            System.out.println("Player 2 bermain");
            System.out.println("Sisa draw kartu : " + p2_draw_chance + " | Kartu yang disimpan : " + p2_hand.size());
            System.out.println("Menu: ");
            System.out.println("1. Draw kartu");
            System.out.println("2. Lihat kartu yang disimpan");
            System.out.println("3. Akhiri giliran");
            System.out.print("Pilihan anda : ");
            p2_menus = scan.nextInt();
            System.out.println("");
            
            switch (p2_menus) {
                case 1 :
                    if (p2_draw_chance == 0 || p2_hand.size() == 5) {
                        System.out.println("Tidak dapat melakukan draw kartu, karena kartu sudah penuh atau sisa draw habis.");
                        System.out.println("");
                    } else {
                        p2_draw_chance--;
                        card_draw = rng.nextInt(12);
                        
                        System.out.println("Kamu menemukan kartu : " + card_draw);
                        System.out.println("1. Simpan kartu");
                        System.out.println("2. Buang kartu");
                        System.out.print("Pilihan kamu : ");
                        store_card_confirm = scan.nextInt();
                        System.out.println("");
                        
                        switch (store_card_confirm) {
                            case 1:
                                System.out.println("Kartu " + card_draw + " disimpan");
                                p2_hand.offer(card_draw);
                                System.out.println("");
                                break;
                            case 2:
                                System.out.println("Kartu " + card_draw + " dibuang");
                                System.out.println("");
                                break;
                            default:
                                System.out.println("Pilihan anda tidak ada dalam menu");
                                break;
                        }
                    }
                    break;
                case 2 :
                    cardInHand(p2_hand);
                    break;
                case 3 :
                    System.out.println("P2 telah selesai.");
                    System.out.println("");
                    
                    if (p2_hand.size() != 5) {
                        p2_hand.offer(0);
                        p2_hand.offer(0);
                        p2_hand.offer(0);
                        p2_hand.offer(0);
                    }
                    
                    p2_play = false;
                    break;
                default :
                    System.out.println("Pilihan anda tidak ada dalam menu");
                    break;
            }
        }
    }
    
    /**
     * Fungsi untuk menampilkan kartu yang telah disimpan
     * @param hand 
     */
    public static void cardInHand(ArrayBlockingQueue hand) {
        System.out.println("Kartu anda saat ini : " + hand);
        System.out.println("");
    }
    
    /**
     * Fungsi untuk mengatur ketika kedua player dalam kondisi card battle
     * @param p1_hand
     * @param p2_hand 
     */
    public static void cardBattle(ArrayBlockingQueue p1_hand, ArrayBlockingQueue p2_hand) {
        int p1_score = 0;
        int p2_score = 0;
        
        System.out.println("Card Battle dimulai!");
        System.out.println("");
        System.out.println("Kartu Player 1 : " + p1_hand);
        System.out.println("Kartu Player 2 : " + p2_hand);
        System.out.println("---------------------------------");
        
        for (int i = 0; i < 5; i++) {
            int p1_peek = (int) p1_hand.peek();
            int p2_peek = (int) p2_hand.peek();
            
            System.out.println("Player 1 : " + p1_hand.peek() + " >< " + p2_hand.peek() + " : Player 2");
            
            if (p1_peek < p2_peek) {
                System.out.println("Player 2 menang, skor +1");
                p2_score += 1;
            } else if (p1_peek > p2_peek) {
                System.out.println("Player 1 menang, skor +1");
                p1_score += 1;
            } else {
                System.out.println("Nilai sama, kedua player skor +1");
                p1_score += 1;
                p2_score += 1;
            }
            
            p1_hand.poll();
            p2_hand.poll();
        }
        
        System.out.println("---------------------------------");
        System.out.println("Skor akhir : ");
        System.out.println("Player 1 : " + p1_score);
        System.out.println("Player 2 : " + p2_score);
        System.out.println("");
        
        if (p1_score > p2_score) {
            System.out.println("Player 1 memenangkan Card Battle");
        } else if (p1_score < p2_score) {
            System.out.println("Player 2 memenangkan Card Battle");
        } else {
            System.out.println("Player 1 dan Player 2 memiliki skor yang sama. Card Battle Seri");
        }
        
        System.out.println("Card Battle berakhir, kembali ke menu utama.");
        System.out.println("");
    }
    
    /**
     * Fungsi utama
     * @param args 
     */
    public static void main(String[] args) {
        boolean play = true;
        int game_status;
        
        ArrayBlockingQueue p1_hand = new ArrayBlockingQueue(5);
        ArrayBlockingQueue p2_hand = new ArrayBlockingQueue(5);
        Random rng = new Random();
        Scanner scan = new Scanner(System.in);
        
        while (play) {
            System.out.println("Selamat datang di Card Battle Game!");
            System.out.println("1. Mulai Bermain");
            System.out.println("2. Tentang Card Battle Game");
            System.out.println("3. Keluar");
            System.out.print("Pilihan anda : ");
            game_status = scan.nextInt();
            System.out.println("");
            
            switch (game_status) {
                case 1 :
                    System.out.println("Game Dimulai!");
                    
                    p1_hand.offer(rng.nextInt(12)); // Menambahkan 1 kartu acak setiap awal permainan
                    p2_hand.offer(rng.nextInt(12));
                    
                    System.out.println("");
                    
                    P1Play(scan, rng, p1_hand);
                    P2Play(scan, rng, p2_hand);
                    
                    System.out.println("Semua player sudah selesai bermain.");
                    
                    cardBattle(p1_hand, p2_hand);
                    break;
                case 2 :
                    aboutGame();
                    break;
                case 3 :
                    System.out.println("Game berakhir, terima kasih telah bermain.");
                    play = false;
                    break;
                default :
                    System.out.println("Pilihan anda tidak ada dalam menu!");
                    System.out.println("");
                    break;
            }
        }
    }
}
