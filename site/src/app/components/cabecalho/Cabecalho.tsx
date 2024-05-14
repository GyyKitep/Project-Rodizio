"use client"

import { useEffect, useState } from "react";
import styles from './Cabecalho.module.scss'
import Link from 'next/link';
import {usePathname } from "next/navigation";

export default function Cabecalho() {

    const pathName = usePathname();
    const [selectedLink, setSelectedLink] = useState('');

    useEffect(() => {
        setSelectedLink(pathName);
      }, [pathName]);

    return (
        <>
            <div className={styles.linha_separador_banner}></div>

            <div className={styles.menu}>
                <ul>
                    <li><Link className={selectedLink == '/' ? styles.selecionado : ''} href="/">Início</Link></li>
                    <li><Link className={selectedLink == '/establishments' ? styles.selecionado : ''} href="/establishments">Mais Restaurantes</Link></li>
                </ul>
            </div>

            <div className={styles.linha_separador_menu}></div>
        </>
    )
}