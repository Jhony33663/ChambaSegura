# ChambaSegura: Conectando Confianza, Entregando Calidad 🛠️✨

## Resumen del Proyecto

**ChambaSegura** es una aplicación móvil diseñada para revolucionar la contratación de servicios y oficios del hogar en Quito. Funciona como un "Uber" de confianza, conectando a usuarios con profesionales verificados (plomeros, electricistas, pintores, etc.) para garantizar trabajos seguros, de calidad y con precios justos.

La plataforma combate la incertidumbre y el riesgo del mercado informal, creando un ecosistema donde la confianza es el servicio principal.

## 🎯 El Problema: La Incertidumbre de Contratar un Servicio

Encontrar un profesional de confianza para arreglos en el hogar es un desafío. El mercado actual se basa en recomendaciones de "boca en boca", lo que genera grandes riesgos:

*   **Inseguridad:** Dejar entrar a un desconocido a casa genera desconfianza y temor.
*   **Estafas y Trabajos Deficientes:** No hay garantía sobre la calidad del trabajo ni protección contra precios abusivos.
*   **Falta de Profesionalismo:** Informalidad en el trato, impuntualidad y falta de un registro profesional.
*   **Precariedad Laboral:** Los profesionales honestos luchan por destacar y encontrar un flujo de trabajo constante y seguro.

## 💡 La Solución: Un Ecosistema de Confianza Verificada

ChambaSegura ataca estos problemas de raíz a través de una plataforma tecnológica que ofrece seguridad y tranquilidad tanto para clientes como para profesionales.

### Para Clientes: "Contrata con Confianza"

*   ✅ **Seguridad Verificada:** Todos los profesionales pasan por un riguroso filtro de verificación de identidad, antecedentes y referencias.
*   ⭐ **Calidad Garantizada:** Un sistema de calificaciones y reseñas públicas te permite elegir basado en la experiencia de otros.
*   💰 **Transparencia Total:** Recibe cotizaciones claras y paga de forma segura a través de la app. El pago se libera solo cuando confirmas que el trabajo está bien hecho.

### Para Profesionales: "Trabajo Digno y Seguro"

*   📈 **Acceso a Clientes de Calidad:** Conéctate con usuarios que valoran la seguridad y están dispuestos a pagar un precio justo.
*   💳 **Pagos Garantizados:** Olvídate del riesgo de no recibir tu pago. La app actúa como intermediario seguro.
*   📄 **Reputación Digital:** Construye un perfil profesional sólido con un historial de trabajos verificados y calificaciones que se convierte en tu mejor carta de presentación.

## ✨ Características Principales

*   **Perfiles Verificados:** Proceso de vetting obligatorio con validación de cédula, referencias y revisión de antecedentes.
*   **Sistema de Calificaciones (Reviews):** Calificaciones detalladas sobre puntualidad, calidad y precio justo.
*   **Cotizaciones Claras y Múltiples:** Describe tu necesidad, sube fotos y recibe varias cotizaciones para comparar.
*   **Geolocalización:** Encuentra profesionales disponibles cerca de ti, ideal para emergencias.
*   **Garantía "ChambaSegura":** El pago queda retenido en la app (escrow) hasta que el cliente confirme la satisfacción con el trabajo.
*   **Comunicación Segura:** Chat y llamadas dentro de la app sin compartir tu número personal.
*   **Seguro de Responsabilidad Civil (Opcional):** Cobertura contra daños accidentales para una tranquilidad total.

## 💻 Stack Tecnológico (Propuesta 2025)

La aplicación se desarrollará con tecnología moderna, nativa de Android, para garantizar el máximo rendimiento, seguridad y una experiencia de usuario fluida.

| Componente | Tecnología Recomendada | Justificación Clave |
| :--- | :--- | :--- |
| **Frontend (App Android)** | Kotlin + Jetpack Compose | Lenguaje oficial de Google, UI moderna y desarrollo rápido. |
| **Backend (BaaS)** | Firebase | Ecosistema completo, escalable y gestionado por Google. |
| **Base de Datos** | Cloud Firestore | NoSQL, flexible, con capacidades en tiempo real. |
| **Autenticación** | Firebase Authentication | Solución segura y fácil de implementar. |
| **Mapas** | Google Maps SDK | Geolocalización para seguimiento en tiempo real. |

*   **minSdkVersion:** API 23 (Android 6.0)
*   **targetSdkVersion:** API 35 (Android 15)

## 📱 Prototipo Funcional

Este repositorio contiene el código fuente del prototipo funcional de la aplicación Android.

### Estructura del Proyecto

*   `app/src/main/java/com/chambasegura/`
    *   `MainActivity.kt`: Punto de entrada de la aplicación.
    *   `ui/auth/LoginScreen.kt`: Pantalla de inicio de sesión.
    *   `ui/home/HomeScreen.kt`: Pantalla principal con categorías de servicios.
    *   `ui/service/ServiceRequestScreen.kt`: Pantalla para solicitar un servicio.
    *   `ui/theme/`: Definición de temas y colores.

### Cómo Ejecutar

1.  Abrir este proyecto en **Android Studio**.
2.  Sincronizar el proyecto con los archivos Gradle.
3.  Ejecutar en un emulador o dispositivo físico con Android 6.0 o superior.

---

*Este proyecto es parte de la materia Desarrollo de Apps Móviles (COM-437ES-AVOL1) de Saint Leo University.*

[Borrador del Informe Completo](https://emailsaintleo-my.sharepoint.com/:b:/g/personal/jonathandavid_mata_saintleo_edu/ET_2ia-UqXRMlYW2_RgfdtwBB355BVHxOIqUv0BtzNnGmA?e=nmZJuK)
