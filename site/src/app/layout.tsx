import Image from 'next/image';
import banner from '../../public/assets/banner.png';
import styles from './Layout.module.scss';
import { register } from 'swiper/element';

register();
import "swiper/scss";
import "swiper/scss/navigation";
import "swiper/scss/scrollbar";
import "swiper/scss/pagination";

export const metadata = {
  title: 'Project Rodizio',
  description: 'Generated by Next.js',
}


export default function RootLayout({
  children,
}: {
  children: React.ReactNode
}) {


  return (
    <html lang="en">
      <body className={styles.custom_body}>
       <Image src={banner} alt="banner" className={styles.imagem_banner} />
        <div className={styles.app_div}>
          {children}
        </div>
      </body>
    </html>
  )
}
