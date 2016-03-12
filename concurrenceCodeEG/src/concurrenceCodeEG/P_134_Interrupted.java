/**
* @Project: concurrenceCodeEG
* @Title: P_134_Interrupted.java
* @Description: TODO
* @author: zhongbo
* @date :2016��3��11�� ����2:24:25
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package concurrenceCodeEG;

import java.util.concurrent.TimeUnit;

/**
* @ClassName: P_134_Interrupted
* @Description: TODO
* @author: zhongbo
* @date: 2016��3��11������2:24:25
* @remark: 
*/

/*public class P_134_Interrupted {

}*/

public  class  P_134_Interrupted {
    public  static  void  main(String[] args)  throws  Exception {
        Thread t =  new  MyThread();
        t.start();
     TimeUnit.SECONDS.sleep(1);//������ܿ�����������б��жϵ����Σ�������������ٿ���Ч��
        t.interrupt();
        System.out.println( "�ѵ����̵߳�interrupt����" );
    }
    static  class  MyThread  extends  Thread {
        public  void  run() {
            int  num;
            try  {
                num = longTimeRunningNonInterruptMethod( 2 ,  0 );
            }  catch  (InterruptedException e) {
                throw  new  RuntimeException(e);
            }
            System.out.println( "��ʱ���������н���,num="  + num);
            System.out.println( "�̵߳��ж�״̬:"  + Thread.interrupted());
        }
        private  static  int  longTimeRunningNonInterruptMethod( int  count,  int  initNum)  
        		throws  InterruptedException {
            if (interrupted()) {
                throw  new  InterruptedException( "��ʽ����ǰ�߳��Ѿ��������ж�" );
            }
           /* for ( int  i= 0 ; i               for ( int  j= 0 ; j                  initNum ++;
                }*/
                //���������һ�����ʵĵط�
                if (interrupted()) {
                    //�ع����ݣ����������
                    throw  new  InterruptedException( "�߳����ڴ�������б��ж�" );
                }
            
            return  initNum;
        }
    }
}

