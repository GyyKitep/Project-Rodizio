"use client";

import { Swiper, SwiperSlide } from "swiper/react";
import styles from "./Carrosel.module.scss";
import { Navigation, Pagination } from "swiper/modules";
import Image from "next/image";

export default function Carrosel() {
  const data = [
    {
      id: "1",
      image:
        "https://www.cnnbrasil.com.br/viagemegastronomia/wp-content/uploads/sites/5/2022/08/votre-brasserie.jpeg?w=1024&h=674&crop=1",
    },
    {
      id: "2",
      image:
        "https://s2.glbimg.com/TYVOVw7XXf6DwUashZWbGR3eZoY=/512x320/smart/e.glbimg.com/og/ed/f/original/2021/09/02/predio-tombado-de-1940-em-sao-paulo-recebe-novo-restaurante-italiano_5.jpg",
    },
    {
      id: "3",
      image:
        "https://www.cnnbrasil.com.br/viagemegastronomia/wp-content/uploads/sites/5/2022/08/votre-brasserie.jpeg?w=1024&h=674&crop=1",
    },
    {
      id: "4",
      image:
        "https://s2.glbimg.com/TYVOVw7XXf6DwUashZWbGR3eZoY=/512x320/smart/e.glbimg.com/og/ed/f/original/2021/09/02/predio-tombado-de-1940-em-sao-paulo-recebe-novo-restaurante-italiano_5.jpg",
    }
  ];

  return (
    <Swiper slidesPerView={1} modules={[Navigation, Pagination]} pagination={{ dynamicBullets: true, }} navigation 
    className="mySwiper" style={{ width: '100%', height:'100%', paddingBottom:'20px'}}
    >
      {data.map((item) => (
        <SwiperSlide key={item.id}>
          <Image
            src={item.image}
            alt="imagem do restaurante"
            width={450}
            height={450}
            className={styles.swiper_image}
          />
        </SwiperSlide>
      ))}
    </Swiper>
  );
}
